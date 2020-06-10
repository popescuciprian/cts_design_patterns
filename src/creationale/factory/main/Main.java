package creationale.factory.main;

import creationale.factory.implementations.method_factory.AbstractDocumentFactory;
import creationale.factory.implementations.method_factory.HTML_Factory;
import creationale.factory.implementations.simple_factory.DocumentFactory;
import creationale.factory.classes.InterfataDocument;
import creationale.factory.classes.TipDocument;

public class Main {
    public static void main(String[] args) {
        // Simple Factory
        InterfataDocument document = DocumentFactory.createDocument(TipDocument.PDF, "LucrareLicenta");
        System.out.println(document.getTip());

        // Method Factory
        AbstractDocumentFactory abstractDocumentFactory = null;
        abstractDocumentFactory = new HTML_Factory(); //Sau ce factory vrea clientul
        InterfataDocument document2 = abstractDocumentFactory.getDocument();
        System.out.println(document2.getTip());


    }
}
