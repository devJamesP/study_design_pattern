package command_pattern.command

import command_pattern.receiver.GarageDoor

class GarageDoorDownCommand(private val garageDoor: GarageDoor): Command {
    override fun execute() {
        garageDoor.down()
    }
    override fun undo() {

    }
}