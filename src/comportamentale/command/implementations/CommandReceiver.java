package comportamentale.command.implementations;

public class CommandReceiver {

    public CommandReceiver() {/*etc*/}

    public void executeCommandTypeA(String type) {
        System.out.println("Command type " + type + " executed!");
    }

    public void executeCommandTypeB(String type) {
        System.out.println("Command type " + type + " executed!");
    }
}
