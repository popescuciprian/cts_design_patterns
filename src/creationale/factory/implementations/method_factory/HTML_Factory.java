package creationale.factory.implementations.method_factory;

import creationale.factory.classes.DocumentHTML;
import creationale.factory.classes.InterfataDocument;

public class HTML_Factory extends AbstractDocumentFactory {

    @Override
    public InterfataDocument getDocument() {
        return new DocumentHTML();
    }
}
