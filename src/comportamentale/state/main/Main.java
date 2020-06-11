package comportamentale.state.main;

import comportamentale.state.implementations.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.afisare("text");
        editor.setStare("bold");
        editor.afisare("text");
        editor.setStare("italic");
        editor.afisare("text");
        editor.setStare("underline");
        editor.afisare("text");
        editor.resetPrefs();
        editor.afisare("text");
    }
}
