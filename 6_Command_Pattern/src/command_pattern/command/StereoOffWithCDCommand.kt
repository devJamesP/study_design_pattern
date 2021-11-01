package command_pattern.command

import command_pattern.receiver.Stereo

class StereoOffWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }
    override fun undo() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }
}