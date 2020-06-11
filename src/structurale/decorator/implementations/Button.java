package structurale.decorator.implementations;

public class Button extends AbstractControlVizual {

    public Button(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public void click() {
        System.out.println("Clicked '" + text + "' button");
    }
}
