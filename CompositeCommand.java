import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        // Изпълняваме всички подкоманди последователно
        for (Command command : commands) {
            command.execute();
        }
    }
}
