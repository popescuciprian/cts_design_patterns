package comportamentale.template.implementations;

public abstract class TestTemplate {
    public abstract void definesteUnitateTestare();

    public abstract void definesteDateIntrare();

    public abstract void definesteRezultate();

    public abstract void ruleazaUnitate();

    public abstract void afisareRezultatTest();

    //functie template
    public final void testeaza() {
        definesteUnitateTestare();
        definesteDateIntrare();
        definesteRezultate();
        ruleazaUnitate();
        afisareRezultatTest();
    }
}
