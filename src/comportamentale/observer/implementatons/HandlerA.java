package comportamentale.observer.implementatons;

public class HandlerA implements HandlerClick{
    @Override
    public void click() {
        System.out.println("Operatie click tratata prin handler A");
    }
}
