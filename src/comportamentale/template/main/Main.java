package comportamentale.template.main;

import comportamentale.template.implementations.NativeTest;
import comportamentale.template.implementations.TestTemplate;
import comportamentale.template.implementations.WebViewTest;

public class Main {
    public static void main(String[] args) {
        TestTemplate testeAplicatieLayoutWeb = new WebViewTest();
        TestTemplate testeAplicatieLayoutNative = new NativeTest();

        testeAplicatieLayoutNative.testeaza();
        testeAplicatieLayoutWeb.testeaza();
    }
}
