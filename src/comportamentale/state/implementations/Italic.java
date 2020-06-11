package comportamentale.state.implementations;

public class Italic implements Printabil {
    @Override
    public void print(String text) {
        System.out.println("ITALIC:"+text);
    }
}
