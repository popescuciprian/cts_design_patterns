package comportamentale.chainOfResponsability.implementations;

public abstract class Handler {
    protected Handler next;

    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    public abstract void gestioneaza(int valoare);
}
