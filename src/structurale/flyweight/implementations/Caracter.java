package structurale.flyweight.implementations;

public class Caracter implements CaracterPrintabil {
    private final String caracter;
    private int fontSize;
    //Alte atribute specifice starii permanente

    public Caracter(String caracter) {
        this.caracter = caracter;
    }

    public String getCaracter() {
        return caracter;
    }

    @Override
    public void printeazaCaracter(CaracterContext context) {
        System.out.println(this.caracter + " este pe pozitia " + context.getPozitieText());
    }
}
