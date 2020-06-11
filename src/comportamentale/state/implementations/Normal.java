package comportamentale.state.implementations;

public class Normal implements Printabil {
    @Override
    public void print(String text) {
        System.out.println("NORMAL:" + text);
    }
}
