package comportamentale.state.implementations;

public class Bold implements Printabil{
    @Override
    public void print(String text) {
        System.out.println("BOLD:"+text);
    }
}
