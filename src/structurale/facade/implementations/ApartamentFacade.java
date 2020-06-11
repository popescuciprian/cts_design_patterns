package structurale.facade.implementations;

import structurale.facade.frameworkComplicat.Cuptor;
import structurale.facade.frameworkComplicat.MasinaSpalat;
import structurale.facade.frameworkComplicat.RobinetApa;
import structurale.facade.frameworkComplicat.UsaIntrare;

public class ApartamentFacade {
    private Cuptor cuptor;
    private MasinaSpalat masinaSpalat;
    private RobinetApa robinetApa;
    private UsaIntrare usaIntrare;

    public ApartamentFacade(Cuptor c, MasinaSpalat m, RobinetApa r, UsaIntrare u) {
        this.cuptor = c;
        this.masinaSpalat = m;
        this.robinetApa = r;
        this.usaIntrare = u;
    }

    public void pornesteMasinaSpalat() {
        this.robinetApa.deschide();
        this.masinaSpalat.porneste();
    }

    public void iesiDinCasa() {
        this.masinaSpalat.opreste();
        this.cuptor.stinge();
        this.usaIntrare.inchide();
    }

    // And so on
}
