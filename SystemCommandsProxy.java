public class SystemCommandsProxy {
    private CompositeCommand compositeCommand = new CompositeCommand();

    public void addCommand(Command command) {
        compositeCommand.addCommand(command);
    }

    public void removeCommand(Command command) {
        compositeCommand.removeCommand(command);
    }

    public void executeCommands() {
        compositeCommand.execute();
    }
}
