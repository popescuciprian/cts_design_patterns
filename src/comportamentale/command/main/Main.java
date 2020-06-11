package comportamentale.command.main;

import comportamentale.command.implementations.CommandInvoker;
import comportamentale.command.implementations.CommandReceiver;
import comportamentale.command.implementations.CommandTypeA;
import comportamentale.command.implementations.CommandTypeB;

public class Main {
    public static void main(String[] args) {
        CommandReceiver receiver = new CommandReceiver();
        CommandReceiver receiver2 = new CommandReceiver();

        CommandInvoker invoker = new CommandInvoker();
        invoker.take(new CommandTypeA(receiver));
        invoker.take(new CommandTypeB(receiver));
        invoker.take(new CommandTypeB(receiver2));

        System.out.println("Waiting...");
        invoker.invoke();
    }
}
