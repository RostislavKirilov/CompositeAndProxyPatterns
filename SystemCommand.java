import java.io.IOException;

public class SystemCommand implements Command {
    private String command;

    public SystemCommand(String command) {
        this.command = command;
    }

    public void execute() {
        // Изпълняваме системната команда
        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
