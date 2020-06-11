package structurale.flyweight.implementations;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {

    private Map<String, Caracter> caractere = new HashMap<>();

    public Caracter getCaracter(String valoareCaracter) {
        Caracter caracter = caractere.get(valoareCaracter);
        if (caracter == null) {
            caracter = new Caracter(valoareCaracter);
            caractere.put(valoareCaracter, caracter);
        }
        return caracter;
    }

    public int getNrCaractere(){
        return caractere.size();
    }
}
