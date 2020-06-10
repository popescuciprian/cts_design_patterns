package creationale.factory.implementations.simple_factory;

import creationale.factory.classes.DocumentHTML;
import creationale.factory.classes.DocumentPDF;
import creationale.factory.classes.InterfataDocument;
import creationale.factory.classes.TipDocument;

public class DocumentFactory {
    public static InterfataDocument createDocument(TipDocument tip, String titlu) {
        InterfataDocument interfataDocument = null;
        switch (tip) {
            case PDF:
                interfataDocument = new DocumentPDF();
                interfataDocument.setTitlu(titlu);
                break;
            case HTML:
                interfataDocument = new DocumentHTML();
                interfataDocument.setTitlu(titlu);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return interfataDocument;
    }
}
