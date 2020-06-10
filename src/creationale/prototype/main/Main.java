package creationale.prototype.main;

import creationale.prototype.implementations.Demon;
import creationale.prototype.implementations.Enemy;
import creationale.prototype.implementations.YoMamma;

public class Main {
    public static void main(String[] args) {
        long startTime, endTime;

        // Without prototype
        startTime = System.currentTimeMillis();
        Demon d1 = new Demon(10, "deadly");
        Demon d2 = new Demon(10, "deadly");
        Demon d3 = new Demon(10, "deadly");
        YoMamma ym1 = new YoMamma(10, "harmless");
        YoMamma ym2 = new YoMamma(10, "harmless");
        YoMamma ym3 = new YoMamma(10, "harmless");
        endTime = System.currentTimeMillis();
        System.out.println("Crearea a 6 enemies a durat " + (endTime - startTime) + "ms");

        // With prototype use of Clone
        startTime = System.currentTimeMillis();
        Demon demonProto = new Demon(10, "deadly");
        YoMamma yoMammaProto = new YoMamma(10, "kind");
        Demon dp1 = demonProto.clone();
        Demon dp2 = demonProto.clone();
        Demon dp3 = demonProto.clone();
        YoMamma ymp1 = yoMammaProto.clone();
        YoMamma ymp2 = yoMammaProto.clone();
        YoMamma ymp3 = yoMammaProto.clone();
        endTime = System.currentTimeMillis();
        System.out.println("Crearea a 6 enemies + 2 prototypes a durat " + (endTime - startTime) + "ms");

    }
}
