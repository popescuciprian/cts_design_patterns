package structurale.adapter.object2framework;

public class MesajA implements MesajTipA {
    private String text;

    public MesajA(String text) {
        this.text = text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
