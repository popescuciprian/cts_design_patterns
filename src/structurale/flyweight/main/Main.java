package structurale.flyweight.main;

import structurale.flyweight.implementations.Caracter;
import structurale.flyweight.implementations.CaracterContext;
import structurale.flyweight.implementations.CaracterFactory;

public class Main {

    private static final Caracter[] caractereText = new Caracter[100];
    private static final CaracterContext[] pozitiiCaractere = new CaracterContext[100];
    private static int nrCaractere = 0;

    public static void apasaTasta(String caracter, int pozitie, CaracterFactory factory) {
        caractereText[nrCaractere] = factory.getCaracter(caracter); //Shallow copy
        pozitiiCaractere[nrCaractere] = new CaracterContext(pozitie);
        nrCaractere++;
    }

    public static void main(String[] args) {
        CaracterFactory factory = new CaracterFactory();
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);
        apasaTasta("a", nrCaractere, factory);

        for (int i = 0; i < nrCaractere; i++) {
            caractereText[i].printeazaCaracter(pozitiiCaractere[i]);
        }
        System.out.println("Nr obiecte create: " + factory.getNrCaractere());
    }
}
