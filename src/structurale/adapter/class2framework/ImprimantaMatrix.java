package structurale.adapter.class2framework;

public class ImprimantaMatrix implements ImprimareMatrice {
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void cancel() {
        System.out.println("Canceling matrix print!");
    }
}
