package structurale.decorator.main;

import structurale.decorator.implementations.*;

public class Main {
    public static void main(String[] args) {
        AbstractControlVizual btnLogin = new Button(0, "Login");
        AbstractControlVizual btnGetDate = new Button(1, "getDate");

        btnLogin.click();
        btnGetDate.click();

        System.out.println("_____");
        AbstractControlVizual btnAnimatie = new DecoratorButonAnimatie(btnLogin);
        btnAnimatie.click();
        System.out.println("_____");
        AbstractControlVizual btnSunet = new DecoratorButonCuSunet(btnLogin, "CoolSound.mp3");
        btnSunet.click();
        System.out.println("_____");
        AbstractControlVizual btnSunetAnimatie = new DecoratorButonCuSunet(btnAnimatie, "NotSoCoolSound.mp3");
        btnSunetAnimatie.click();
        System.out.println("_____");
        AbstractControlVizual btnSpecial = new DecoratorAbstractControlVizual(btnGetDate) {
            @Override
            public void click() {
                this.controlVizual.click();
                System.out.println("ZIPZIP");
            }
        };
        btnSpecial.click();
    }
}
