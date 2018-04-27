public class ObserverB implements Observer {
    public void update() {
        System.out.println("C was notified of update!");
    }
}