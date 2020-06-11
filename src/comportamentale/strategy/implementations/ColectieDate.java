package comportamentale.strategy.implementations;

public class ColectieDate {
    private int valori[];
    private Procesabil procesabil = null;

    public ColectieDate(int[] valori) {
        this.valori = valori;
    }

    public void setProcesabil(Procesabil procesabil) {
        this.procesabil = procesabil;
    }

    public int proceseaza() {
        if (procesabil != null) {
            return procesabil.compute(valori);
        } else
            throw new UnsupportedOperationException();
    }
}
