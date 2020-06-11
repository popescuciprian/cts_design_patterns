package comportamentale.observer.implementatons;

public class HandlerB implements HandlerClick{
    @Override
    public void click() {
        System.out.println("Operatie click tratata prin handler B");
    }
}
