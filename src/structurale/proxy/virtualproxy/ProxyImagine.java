package structurale.proxy.virtualproxy;

public class ProxyImagine implements InterfataImagine {

    private Imagine imagineReala;
    private String fisier;

    public ProxyImagine(String fisier) {
        this.fisier = fisier;
    }


    private boolean existaMemorieSuficienta(String fisier) {
        System.out.println("Se verifica daca exista memorie ...");
        return true;
    }

    @Override
    public void afiseazaImagine() {
        if (existaMemorieSuficienta(this.fisier)) {
            if (imagineReala == null)
                imagineReala = new Imagine(fisier);
            imagineReala.afiseazaImagine();
        }
    }
}
