package comportamentale.command.implementations;

public class CommandTypeA implements CommandInterface {

    private CommandReceiver receiver;
    private final String type = "A";

    public CommandTypeA(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.executeCommandTypeA(type);
    }
}
