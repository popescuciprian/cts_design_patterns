package comportamentale.memento.main;

import comportamentale.memento.implementations.CareTaker;
import comportamentale.memento.implementations.Originator;

public class Main {
    public static void main(String[] args) {
        CareTaker notepadApp = new CareTaker();
        Originator fisier = new Originator();

        fisier.addText("Ana are mere.");
        fisier.addText("Ana merge la piata.");

        notepadApp.careTakerSave(fisier.save());

        fisier.addText("Este o zi frumoasa.");

        notepadApp.careTakerSave(fisier.save());

        fisier.addText("De primavara.");

        fisier.load(notepadApp.recoverLastSave());
        fisier.load(notepadApp.recoverLastSave());
        fisier.load(notepadApp.recoverLastSave());

        System.out.println(fisier.getText());
    }
}
