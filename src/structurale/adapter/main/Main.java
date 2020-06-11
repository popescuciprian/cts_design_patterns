package structurale.adapter.main;

import structurale.adapter.class2framework.ClassToFrameworkAdapter;
import structurale.adapter.class2framework.ImprimareLaser;
import structurale.adapter.object2framework.A2bObjectAdapter;
import structurale.adapter.object2framework.MesajA;
import structurale.adapter.object2framework.MesajB;
import structurale.adapter.object2framework.MesajTipB;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // OBIECT ---> Framework
        List<Object> mesaje = new ArrayList<>();
        mesaje.add(new MesajA("Ciprian are mere"));
        mesaje.add(new MesajB(new String[]{"Ciprian", "are", "pere"}));

        //PROBLEMA -- ce faci daca sunt 100 obiecte? 100 instanceof?
        for (Object m : mesaje) {
            if (m instanceof MesajA)
                ((MesajA) m).print();
            if (m instanceof MesajB)
                ((MesajB) m).display();
        }
        //REZOLVARE
        List<MesajTipB> mesajeFrameworkNou = new ArrayList<>();
        A2bObjectAdapter adapter = new A2bObjectAdapter(new MesajA("Ciprian are mere"));
        mesajeFrameworkNou.add(adapter);
        mesajeFrameworkNou.add(new MesajB(new String[]{"Ciprian", "are", "pere"}));
        for(MesajTipB m: mesajeFrameworkNou)
            m.display();

        //==========================================================
        // CLASA ---> Framework

        ImprimareLaser laser = new ClassToFrameworkAdapter();
        laser.printLaser(new String[]{"Paragraf1","Paragraf2","Paragraf3"});
        laser.cancelPrint();
    }
}
