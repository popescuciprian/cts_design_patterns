package structurale.flyweight.implementations;

public class CaracterContext {
    private final int pozitieText;

    public CaracterContext(int pozitie){
        this.pozitieText = pozitie;
    }

    public int getPozitieText() {
        return pozitieText;
    }
}
