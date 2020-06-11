package comportamentale.state.implementations;

public class Underline implements Printabil {
    @Override
    public void print(String text) {
        System.out.println("UNDERLINED:"+text);
    }
}
