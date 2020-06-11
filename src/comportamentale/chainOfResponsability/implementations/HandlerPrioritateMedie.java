package comportamentale.chainOfResponsability.implementations;

public class HandlerPrioritateMedie extends Handler {
    @Override
    public void gestioneaza(int valoare) {
        if (valoare > 50 && valoare <= 100)
            System.out.println("Gestionat de HandlerPrioritateMedie");
        else if (this.next != null)
            this.next.gestioneaza(valoare);
        else
            throw new UnsupportedOperationException();
    }
}
