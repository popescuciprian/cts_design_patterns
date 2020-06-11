package structurale.composite.implementations;

public abstract class NodStructuraIerarhica {

    public abstract String getNume();

    public abstract String getPost();

    public abstract double getSalariu();

    public String getInfo() {
        return this.getNume() + " - " + this.getPost();
    }

    public void adaugaNodCopil(NodStructuraIerarhica elementStructura) {
        throw new UnsupportedOperationException();
    }

    public void stergeNodCopil(NodStructuraIerarhica elementStructura) {
        throw new UnsupportedOperationException();
    }

    public NodStructuraIerarhica getNodCopil(int i) {
        throw new UnsupportedOperationException();
    }
}
