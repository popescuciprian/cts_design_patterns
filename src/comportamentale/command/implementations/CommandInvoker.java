package comportamentale.command.implementations;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

    public List<CommandInterface> commands;

    public CommandInvoker() {
        //etc
        commands = new ArrayList<>();
    }

    public void take(CommandInterface command) {
        commands.add(command);
    }

    public void invoke() {
        for (CommandInterface command : commands)
            command.execute();
        this.commands.clear();
    }
}
