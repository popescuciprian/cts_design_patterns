package structurale.composite.implementations;

public class Angajat extends NodStructuraIerarhica {

    String nume;
    String post;
    double salariu;

    public Angajat(String nume, String post) {
        this.nume = nume;
        this.post = post;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPost() {
        return post;
    }

    @Override
    public double getSalariu() {
        return salariu;
    }
}
