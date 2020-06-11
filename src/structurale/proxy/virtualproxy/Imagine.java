package structurale.proxy.virtualproxy;

public class Imagine implements InterfataImagine {

    private String fisier;

    public Imagine(String fisier) {
        this.fisier = fisier;
        incarcaImagine();
    }

    public void incarcaImagine() {
        System.out.println("Imaginea se incarca");
    }

    @Override
    public void afiseazaImagine() {
        System.out.println("Imaginea se afiseaza");
    }
}
