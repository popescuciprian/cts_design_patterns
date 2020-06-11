package comportamentale.chainOfResponsability.implementations;

public class HandlerPrioritateMaxima extends Handler {

    @Override
    public void gestioneaza(int valoare) {
        if (valoare > 100)
            System.out.println("Gestionat de HandlerPrioritateMaxima");
        else if (this.next != null)
            this.next.gestioneaza(valoare);
        else
            throw new UnsupportedOperationException();

    }
}
