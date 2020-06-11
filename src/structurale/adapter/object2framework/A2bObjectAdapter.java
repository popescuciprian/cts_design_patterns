package structurale.adapter.object2framework;

public class A2bObjectAdapter implements MesajTipB {
    private MesajTipA ref;

    public A2bObjectAdapter(MesajTipA ref) {
        this.ref = ref;
    }

    @Override
    public void setText(String[] text) {
        StringBuilder sb = new StringBuilder();
        for (String t : text)
            sb.append(t).append(" ");
        this.ref.setText(sb.toString().trim());
    }

    @Override
    public String[] getText() {
        return this.ref.getText().split(" ");
    }

    @Override
    public void display() {
        this.ref.print();
    }
}
