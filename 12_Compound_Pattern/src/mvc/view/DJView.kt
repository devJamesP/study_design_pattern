package mvc.view

import mvc.controller.ControllerInterface
import mvc.feature.BeatBar
import mvc.model.BeatModelInterface
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.GridLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import kotlin.system.exitProcess


class DJView(
    private val model : BeatModelInterface,
    private val controller : ControllerInterface
) : ActionListener, BeatObserver, BPMObserver {
    private val viewFrame : JFrame by lazy { JFrame("View") }
    private val viewPanel : JPanel by lazy { JPanel(GridLayout(1, 2)) }
    private val beatBar : BeatBar by lazy { BeatBar() }
    private val bpmOutputLabel : JLabel by lazy { JLabel("offline", SwingConstants.CENTER) }
    private val controlFrame : JFrame by lazy { JFrame("Control") }
    private val controlPanel : JPanel by lazy { JPanel(GridLayout(1, 2)) }
    private val bpmLabel : JLabel by lazy { JLabel("Enter BPM: ", SwingConstants.RIGHT) }
    private val bpmTextField : JTextField by lazy { JTextField(2) }
    private val setBPMButton : JButton by lazy { JButton("Set") }
    private val increaseBPMButton : JButton by lazy { JButton(">>") }
    private val decreaseBPMButton: JButton by lazy { JButton("<<") }
    private val menuBar : JMenuBar by lazy { JMenuBar() }
    private val menu : JMenu by lazy { JMenu() }
    private val startMenuItem : JMenuItem by lazy { JMenuItem("Start") }
    private val stopMenuItem : JMenuItem by lazy { JMenuItem("Stop") }

    init {
        model.registerObserver(this as BeatObserver)
        model.registerObserver(this as BPMObserver)
    }

    fun createView() {
        // 스윙 구성요소를 생성하는 부분
        viewFrame.apply {
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            size = Dimension(100, 80)
        }
        beatBar.value = 0

        val bpmPanel = JPanel(GridLayout(2, 1)).apply {
            add(beatBar)
            add(bpmOutputLabel)
        }

        viewPanel.add(bpmPanel)
        viewFrame.apply {
            contentPane.add(viewPanel, BorderLayout.CENTER)
            viewFrame.pack()
            viewFrame.isVisible = true
        }
    }

    fun createControls() {
        // 스윙 구성요소 생성
        JFrame.setDefaultLookAndFeelDecorated(true)
        controlFrame.apply {
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            size = Dimension(100, 80)
        }

        startMenuItem.addActionListener { controller.start() }
        stopMenuItem.addActionListener { controller.stop() }
        menu.add(startMenuItem)
        menu.add(stopMenuItem)

        val exit = JMenuItem("Quit")
        exit.addActionListener { exitProcess(0) }
        menu.add(exit)
        menuBar.add(menu)
        controlFrame.jMenuBar = menuBar

        setBPMButton.apply {
            size = Dimension(10, 40)
            addActionListener(this@DJView)
        }
        increaseBPMButton.addActionListener(this@DJView)
        decreaseBPMButton.addActionListener(this@DJView)

        val buttonPanel = JPanel(GridLayout(1, 2))

        buttonPanel.add(decreaseBPMButton)
        buttonPanel.add(increaseBPMButton)

        val enterPanel = JPanel(GridLayout(1, 2))
        enterPanel.add(bpmLabel)
        enterPanel.add(bpmTextField)

        val insideControlPanel = JPanel(GridLayout(3, 1))
        insideControlPanel.add(enterPanel)
        insideControlPanel.add(setBPMButton)
        insideControlPanel.add(buttonPanel)
        controlPanel.add(insideControlPanel)

        bpmLabel.border = BorderFactory.createEmptyBorder(5,5,5,5)
        bpmOutputLabel.border = BorderFactory.createEmptyBorder(5,5,5,5)

        controlFrame.rootPane.defaultButton = setBPMButton
        controlFrame.contentPane.add(controlPanel, BorderLayout.CENTER)

        controlFrame.pack()
        controlFrame.isVisible = true

    }

    fun enableStopMenuItem() {
        stopMenuItem.isEnabled = true
    }

    fun disableStopMenuItem() {
        stopMenuItem.isEnabled = false
    }

    fun enableStartMenuItem() {
        startMenuItem.isEnabled = true
    }

    fun disableStartMenuItem() {
        startMenuItem.isEnabled = false
    }

    override fun actionPerformed(event : ActionEvent) {
        when(event.source) {
            setBPMButton -> {
                val bpm = bpmTextField.text.toInt()
                controller.setBPM(bpm)
            }
            increaseBPMButton -> controller.increaseBPM()
            decreaseBPMButton -> controller.decreaseBPM()
        }
    }

    override fun updateBPM() {
        val bpm = model.getBPM()
        if (bpm == 0) bpmOutputLabel.text = "offline"
        else bpmOutputLabel.text = "Current BPM: ${model.getBPM()}"
    }

    override fun updateBeat() {
        beatBar.value = 100
    }
}