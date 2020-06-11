package comportamentale.command.implementations;

public class CommandTypeB implements CommandInterface {

    private CommandReceiver receiver;
    private final String type = "B";

    public CommandTypeB(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.executeCommandTypeB(type);
    }
}
