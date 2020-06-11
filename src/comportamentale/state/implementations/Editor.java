package comportamentale.state.implementations;

public class Editor {

    private Printabil printabil;

    public Editor() {
        printabil = new Normal();
    }

    public void setStare(String stare) {
        if ("normal".equals(stare))
            this.printabil = new Normal();
        if ("bold".equals(stare))
            this.printabil = new Bold();
        if ("italic".equals(stare))
            this.printabil = new Italic();
        if ("underline".equals(stare))
            this.printabil = new Underline();
    }

    public void afisare(String text) {
        this.printabil.print(text);
    }

    public void resetPrefs() {
        this.printabil = new Normal();
    }

}
