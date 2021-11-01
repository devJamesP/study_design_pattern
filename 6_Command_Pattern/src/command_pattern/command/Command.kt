package command_pattern.command

interface Command {
    fun execute()
    fun undo()
}