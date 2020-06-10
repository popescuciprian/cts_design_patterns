package creationale.factory.classes;

public class DocumentHTML extends InterfataDocument {
    @Override
    public String getTip() {
        return "HTML";
    }

    @Override
    public void print(String text) {
        System.out.println("DOCUMENT HTML");
    }
}
