package creationale.singleton.main;

import creationale.singleton.implementations.Singleton1;
import creationale.singleton.implementations.Singleton2;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton1_copy1 = Singleton1.getInstance();
        Singleton1 singleton1_copy2 = Singleton1.getInstance();
        // Expect one message

        Singleton2 singleton2 = Singleton2.instance;
        Singleton2 singleton2_copy1 = Singleton2.instance;
        Singleton2 singleton2_copy2 = Singleton2.instance;
        // Expect one message
    }
}
