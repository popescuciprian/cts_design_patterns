package structurale.decorator.implementations;

public class DecoratorButonCuSunet extends DecoratorAbstractControlVizual {

    String fisierSunet;

    public DecoratorButonCuSunet(AbstractControlVizual controlVizual, String fisier) {
        super(controlVizual);
        this.fisierSunet = fisier;
    }

    @Override
    public void click() {
        this.controlVizual.click();
        System.out.println("Click cu sunet din " + fisierSunet);
    }
}
