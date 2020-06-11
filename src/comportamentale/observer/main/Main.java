package comportamentale.observer.main;

import comportamentale.observer.implementatons.*;

public class Main {
    public static void main(String[] args) {
        Clickable btn = new Button();
        HandlerClick handlerLogin = new HandlerA();
        HandlerClick handlerNotificare = new HandlerB();
        btn.abonareHandler(handlerLogin);
        btn.abonareHandler(handlerNotificare);
        btn.click();
        System.out.println(" _______________ ");
        btn.dezabonareHandler(handlerNotificare);
        btn.click();
        btn.click();
    }
}
