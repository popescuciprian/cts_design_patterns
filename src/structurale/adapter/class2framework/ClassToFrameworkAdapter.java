package structurale.adapter.class2framework;

public class ClassToFrameworkAdapter extends ImprimantaMatrix implements ImprimareLaser {

    @Override
    public void printLaser(String[] paragrafe) {
        this.print(paragrafeToText(paragrafe));
    }

    private String paragrafeToText(String[] paragrafe) {
        StringBuilder sb = new StringBuilder();
        for(String s : paragrafe)
            sb.append(s).append("\n");
        return sb.toString();
    }

    @Override
    public void cancelPrint() {
        this.cancel();
    }

}
