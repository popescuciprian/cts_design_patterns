package creationale.factory.classes;

public class DocumentPDF extends InterfataDocument {
    @Override
    public String getTip() {
        return "PDF";
    }

    @Override
    public void print(String text) {
        System.out.println("DOCUMENT PDF");
    }
}
