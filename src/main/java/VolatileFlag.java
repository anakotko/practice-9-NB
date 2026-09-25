public class VolatileFlag extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        int count = 0;
        while (running) {
            System.out.println(count++);
        }
    }

    public void stopThread() {
        running = false;
    }
}
