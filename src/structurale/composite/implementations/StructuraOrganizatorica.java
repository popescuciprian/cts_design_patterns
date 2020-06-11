package structurale.composite.implementations;

import java.util.ArrayList;
import java.util.List;

public class StructuraOrganizatorica extends NodStructuraIerarhica {

    List<NodStructuraIerarhica> elementeStructura = new ArrayList<>();
    String nume;
    String descriere;

    public StructuraOrganizatorica(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
    }

    @Override
    public String getInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append(nume + " - " + this.descriere);
        sb.append("\n");

        for (NodStructuraIerarhica nod : elementeStructura) {
            sb.append("\t" + nod.getInfo());
        }

        return sb.toString();
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getSalariu() {
        float fondSalarii = 0;
        for (NodStructuraIerarhica nod : this.elementeStructura) {
            fondSalarii += nod.getSalariu();
        }
        return fondSalarii;
    }

    @Override
    public void adaugaNodCopil(NodStructuraIerarhica elementStructura) {
        elementeStructura.add(elementStructura);
    }

    @Override
    public void stergeNodCopil(NodStructuraIerarhica elementStructura) {
        elementeStructura.remove(elementStructura);
    }

    @Override
    public NodStructuraIerarhica getNodCopil(int i) {
        return elementeStructura.get(i);
    }
}
