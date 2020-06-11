package comportamentale.memento.implementations;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> saves = new ArrayList<>();

    public void careTakerSave(Memento save) {
        saves.add(save);
    }

    public Memento recoverLastSave() {
        if (saves.size() != 0) {
            Memento salvare = saves.get(saves.size() - 1);
            saves.remove(saves.size() - 1);
            return salvare;
        } else
            return new Memento("");
    }

}
