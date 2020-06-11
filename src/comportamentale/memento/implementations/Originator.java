package comportamentale.memento.implementations;

public class Originator {
    private String text;

    public Originator() {
        this.text = "";
    }

    public void addText(String text) {
        this.text += text;
    }

    public Memento save() {
        System.out.println("Saving text state!");
        return new Memento(this.text);
    }

    public void load(Memento save) {
        System.out.println("Loading / Undoing specific state!");
        this.text = save.getText();
    }


    public String getText() {
        return text;
    }
}
