package command_pattern.command

class MacroCommand(
    private val commands: List<Command>
) : Command {

    override fun execute() {
        commands.forEach {
            it.execute()
        }
    }

    override fun undo() {
        commands.forEach {
            it.undo()
        }
    }
}