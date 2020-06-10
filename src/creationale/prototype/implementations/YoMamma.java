package creationale.prototype.implementations;

public class YoMamma extends Enemy implements Cloneable { // Got it? :V
    private String tip;

    public YoMamma(int playerLevel, String tip) {
        super(playerLevel);
        this.tip = tip;
    }

    @Override
    public YoMamma clone() {
        YoMamma clone = null;
        try {
            clone = (YoMamma) super.clone();
            clone.tip = this.tip;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
