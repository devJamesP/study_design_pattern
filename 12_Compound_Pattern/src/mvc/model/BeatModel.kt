package mvc.model

import mvc.view.BPMObserver
import mvc.view.BeatObserver
import javax.sound.midi.*

class BeatModel : BeatModelInterface, MetaEventListener {
    private var sequencer: Sequencer? = null

    private val beatObservers = arrayListOf<BeatObserver>()
    private val bpmObservers = arrayListOf<BPMObserver>()

    private var bpm = 90

    private var sequence : Sequence? = null
    private var track: Track? = null


    override fun initialize() {
        setUpMidi()
        buildTrackAndStart()
    }

    override fun on() {
        sequencer?.start()
        setBPM(90)
    }

    override fun off() {
        setBPM(0)
        sequencer?.stop()
    }

    override fun setBPM(bpm: Int) {
        this.bpm = bpm
        sequencer?.tempoInBPM = getBPM().toFloat()
        notifyBPMObservers()
    }

    override fun getBPM(): Int {
        return bpm
    }

    private fun beatEvent() {
        notifyBeatObservers()
    }

    override fun registerObserver(o: BeatObserver) {
        beatObservers.add(o)
    }

    override fun removeObserver(o: BeatObserver) {
        val index = beatObservers.indexOf(o)
        if (index >= 0) beatObservers.removeAt(index)
    }

    private fun notifyBeatObservers() {
        for (observer in beatObservers)
            observer.updateBeat()
    }


    override fun registerObserver(o: BPMObserver) {
        bpmObservers.add(o)
    }

    override fun removeObserver(o: BPMObserver) {
        val index = bpmObservers.indexOf(o)
        if (index >= 0) bpmObservers.removeAt(index)
    }

    private fun notifyBPMObservers() {
        for (observer in bpmObservers)
            observer.updateBPM()
    }

    override fun meta(message: MetaMessage) {
        if (message.type == 47) {
            beatEvent()
            sequencer?.start()
            setBPM(bpm)
        }
    }

    private fun setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer()

            sequencer?.open()
            sequencer?.addMetaEventListener(this)
            sequence = Sequence(Sequence.PPQ, 4)
            track = sequence?.createTrack()
            sequencer?.tempoInBPM = getBPM().toFloat()
        } catch (e : Exception) {
            e.printStackTrace()
        }
    }

    private fun buildTrackAndStart() {
        val trackList = intArrayOf(35, 0, 46, 0)

        sequence?.deleteTrack(null)
        track = sequence?.createTrack()

        makeTracks(trackList)
        track?.add(makeEvent(192, 9, 1, 0, 4))
        try {
            sequencer?.sequence = sequence
        } catch (e : Exception) {
            e.printStackTrace()
        }
    }

    private fun makeTracks(list : IntArray) {
        for (key in list) {
            if (key != 0) {
                track?.add(makeEvent(144, 9, key, 100, key.toLong()))
                track?.add(makeEvent(128, 9, key, 100, (key+1).toLong()))
            }
        }
    }

    private fun makeEvent(comd: Int, chan : Int, one : Int, two : Int, tick : Long) : MidiEvent {
        var event : MidiEvent? = null
        try {
            val a : ShortMessage = ShortMessage()
            a.setMessage(comd, chan, one, two)
            event = MidiEvent(a, tick)
        } catch (e : Exception) {
            e.printStackTrace()
        }
        return event ?: throw ExceptionInInitializerError("이벤트가 생성되지 않았습니다.")
    }
}