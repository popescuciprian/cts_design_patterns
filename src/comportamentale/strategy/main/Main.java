package comportamentale.strategy.main;

import comportamentale.strategy.implementations.ColectieDate;
import comportamentale.strategy.implementations.Medie;
import comportamentale.strategy.implementations.Produs;
import comportamentale.strategy.implementations.Suma;

public class Main {
    public static void main(String[] args) {
        ColectieDate date = new ColectieDate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        date.setProcesabil(new Suma());
        System.out.println("SUMA: "+date.proceseaza());
        date.setProcesabil(new Produs());
        System.out.println("PRODUS: "+date.proceseaza());
        date.setProcesabil(new Medie());
        System.out.println("MEDIE: "+date.proceseaza());
    }
}
