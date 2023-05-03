public class Main {
    public static void main(String[] args) {
        SystemCommandsProxy systemCommandsProxy = new SystemCommandsProxy();
        systemCommandsProxy.addCommand(new SystemCommand("echo Hello World"));
        systemCommandsProxy.addCommand(new SystemCommand("dir"));
        systemCommandsProxy.addCommand(new SystemCommand("ipconfig"));
        systemCommandsProxy.executeCommands();

        // Добавяне на нови команди
        systemCommandsProxy.addCommand(new SystemCommand("cd C:\\"));
        systemCommandsProxy.addCommand(new SystemCommand("dir"));
        systemCommandsProxy.executeCommands();

        // Премахване на команда
        Command commandToRemove = new SystemCommand("ipconfig");
        systemCommandsProxy.removeCommand(commandToRemove);
        systemCommandsProxy.executeCommands();
    }
}
