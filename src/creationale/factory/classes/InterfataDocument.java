package creationale.factory.classes;

public abstract class InterfataDocument {
    private String titlu;

    public abstract String getTip();

    public abstract void print(String text);

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
