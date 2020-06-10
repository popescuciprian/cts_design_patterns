package creationale.prototype.implementations;

public class Demon extends Enemy implements Cloneable {
    private String tip;

    public Demon(int playerLevel, String tip) {
        super(playerLevel);
        this.tip = tip;
    }

    @Override
    public Demon clone() {
        Demon clone = null;
        try {
            clone = (Demon) super.clone();
            clone.tip = this.tip;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
