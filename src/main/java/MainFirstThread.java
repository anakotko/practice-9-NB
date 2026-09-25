public class MainFirstTread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println();
            }
        }
    }
}
