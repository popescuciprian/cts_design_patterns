package comportamentale.observer.implementatons;

public class Button extends Clickable {
    private boolean isClicked = false;

    public void setClicked() {
        if (!isClicked) {
            isClicked = true;
            this.notificareObservatori();
        } else {
            isClicked = false;
        }
    }

    public void click(){
        System.out.println("BUTTON APASAT!");
        setClicked();
    }
}
