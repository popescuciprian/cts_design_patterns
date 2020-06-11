package comportamentale.chainOfResponsability.implementations;

public class HandlerPrioritateMica extends Handler {
    @Override
    public void gestioneaza(int valoare) {
        if (valoare <= 50)
            System.out.println("Gestionat de HandlerPrioritateMica");
    }
}
