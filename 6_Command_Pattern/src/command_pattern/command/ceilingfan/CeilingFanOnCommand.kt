package command_pattern.command.ceilingfan

import command_pattern.command.Command
import command_pattern.receiver.CeilingFan

class CeilingFanOnCommand(private val ceilingFan: CeilingFan): Command {
    override fun execute() {
        ceilingFan.low()
    }
    override fun undo() {

    }
}