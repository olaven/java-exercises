public class SecondAction extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            long timestamp = System.currentTimeMillis();

            System.out.println("second action is running " + timestamp);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("second action interrupted");
            }
        }
    }
}