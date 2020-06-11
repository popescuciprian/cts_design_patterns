package structurale.facade.main;

import structurale.facade.frameworkComplicat.Cuptor;
import structurale.facade.frameworkComplicat.MasinaSpalat;
import structurale.facade.frameworkComplicat.RobinetApa;
import structurale.facade.frameworkComplicat.UsaIntrare;
import structurale.facade.implementations.ApartamentFacade;

public class Main {
    public static void main(String[] args) {
        ApartamentFacade apartament = new ApartamentFacade(new Cuptor(), new MasinaSpalat(), new RobinetApa(), new UsaIntrare());

        apartament.pornesteMasinaSpalat();
        apartament.iesiDinCasa();

        // Intr-o implementare fara Facade, se puteau definii metodele Apartament in "main" sau in contextul dezvoltat. Astfel, prin
        // Apartament, s-a creat un layer mai simplist peste framework-ul "compliat"
    }
}
