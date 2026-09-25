public class MainVolatile {
    public static void main(String[] args) throws InterruptedException {
        VolatileFlag thread = new VolatileFlag();
        thread.start();
        Thread.sleep(2000);
        thread.stopThread();
    }
}
