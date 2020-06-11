package structurale.decorator.implementations;

public class DecoratorButonAnimatie extends DecoratorAbstractControlVizual {

    public DecoratorButonAnimatie(AbstractControlVizual controlVizual) {
        super(controlVizual);
    }

    @Override
    public void click() {
        this.controlVizual.click();
        System.out.println("Animatie text button");
    }
}
