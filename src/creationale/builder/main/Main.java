package creationale.builder.main;

import creationale.builder.implementations.DispozitivMobil1;
import creationale.builder.implementations.DispozitivMobil2;

public class Main {
    public static void main(String[] args) {
        DispozitivMobil1 telefon = new DispozitivMobil1.DispozitivMobilBuilder()
                .withFabricant("Samsung")
                .withModel("Galaxy S3")
                .withRAM(2)
                .withInterfata1(new Object())
                .build();
        System.out.println(telefon.getFabricant() + telefon.getModel());

        DispozitivMobil2 telefon2 = new DispozitivMobil2.DispozitivMobilBuilder()
                .withFabricant("Nokia")
                .withModel("Lumia 520")
                .withRAM(4)
                .withInterfata1(new Object())
                .build();
        System.out.println(telefon2.getFabricant() + telefon2.getModel());

    }

}
