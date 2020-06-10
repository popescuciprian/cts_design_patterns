package creationale.prototype.implementations;

public abstract class Enemy implements Cloneable {
    protected double damagePoints;

    public Enemy(int playerLevel) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Pretend this takes a lot of time to compute
        this.damagePoints = 0.6 * playerLevel;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
