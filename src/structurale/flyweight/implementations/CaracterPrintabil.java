package structurale.flyweight.implementations;

//Flyweight Interface
public interface CaracterPrintabil {
    // Primeste starea temporara -> context
    void printeazaCaracter(CaracterContext context);
}
