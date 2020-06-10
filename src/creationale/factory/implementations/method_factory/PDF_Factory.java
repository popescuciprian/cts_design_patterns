package creationale.factory.implementations.method_factory;

import creationale.factory.classes.DocumentPDF;
import creationale.factory.classes.InterfataDocument;

public class PDF_Factory extends AbstractDocumentFactory {

    @Override
    public InterfataDocument getDocument() {
        return new DocumentPDF();
    }
}
