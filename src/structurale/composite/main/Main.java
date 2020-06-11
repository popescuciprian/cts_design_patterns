package structurale.composite.main;

import structurale.composite.implementations.Angajat;
import structurale.composite.implementations.StructuraOrganizatorica;

public class Main {
    public static void main(String[] args) {
        StructuraOrganizatorica departamentIT = new StructuraOrganizatorica("IT","Software Development");
        StructuraOrganizatorica departamentVanzari = new StructuraOrganizatorica("VANZARI","Finante, Contabilitate");

        departamentVanzari.adaugaNodCopil(new Angajat("Popescu","Contabil"));
        departamentVanzari.adaugaNodCopil(new Angajat("Ionescu","Manager"));

        departamentIT.adaugaNodCopil(new Angajat("Ciprian","QA"));
        departamentIT.adaugaNodCopil(departamentVanzari);

        System.out.println(departamentIT.getInfo());
    }
}
