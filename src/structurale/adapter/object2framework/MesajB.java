package structurale.adapter.object2framework;

public class MesajB implements MesajTipB {
    private String[] text;

    public MesajB(String[] text) {
        this.text = text;
    }

    @Override
    public void setText(String[] text) {
        this.text = new String[text.length];
        for (int i = 0; i < text.length; i++)
            this.text[i] = text[i];
    }

    @Override
    public String[] getText() {
        return text;
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        for (String t : text)
            sb.append(t).append(" ");
        System.out.println(sb.toString().trim());
    }
}
