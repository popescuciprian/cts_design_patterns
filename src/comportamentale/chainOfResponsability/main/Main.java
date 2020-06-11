package comportamentale.chainOfResponsability.main;

import comportamentale.chainOfResponsability.implementations.Handler;
import comportamentale.chainOfResponsability.implementations.HandlerPrioritateMaxima;
import comportamentale.chainOfResponsability.implementations.HandlerPrioritateMedie;
import comportamentale.chainOfResponsability.implementations.HandlerPrioritateMica;

public class Main {
    public static void main(String[] args) {
        Handler handlerMic = new HandlerPrioritateMica();
        Handler handlerMediu = new HandlerPrioritateMedie();
        Handler handlerMare = new HandlerPrioritateMaxima();
        handlerMare.setNextHandler(handlerMediu);
        handlerMediu.setNextHandler(handlerMic);

        handlerMare.gestioneaza(120);
        handlerMare.gestioneaza(57);
        handlerMare.gestioneaza(45);
        handlerMare.gestioneaza(0);
    }
}
