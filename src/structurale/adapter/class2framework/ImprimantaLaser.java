package structurale.adapter.class2framework;

public class ImprimantaLaser implements ImprimareLaser {
    @Override
    public void printLaser(String[] paragrafe) {
        for(String s:paragrafe)
            System.out.println(s);
    }

    @Override
    public void cancelPrint() {
        System.out.println("Canceling laser print!");
    }
}
