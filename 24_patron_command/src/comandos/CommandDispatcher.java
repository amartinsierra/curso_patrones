package comandos;

import java.util.ArrayList;
import java.util.List;

public class CommandDispatcher {
    private final List<Command> commands=new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void dispatch() {
        commands.forEach(Command::execute);
    }
}

