package comportamentale.observer.implementatons;

import java.util.ArrayList;
import java.util.List;

public abstract class Clickable {
    List<HandlerClick> observatori = new ArrayList<>();

    public void abonareHandler(HandlerClick handlerClick) {
        observatori.add(handlerClick);
    }

    public void dezabonareHandler(HandlerClick handlerClick) {
        observatori.remove(handlerClick);
    }

    public void notificareObservatori() {
        for (HandlerClick handlerClick : observatori)
            handlerClick.click();
    }

    public abstract void click();
}
