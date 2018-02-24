package concurrent_assignment1.A;

/**
 * Get the reference of the main thread
 */
public class Reference {

    public static void main(String[] args) throws InterruptedException {
        Thread h = Thread.currentThread();
        h.setName("A");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "" + h.getName());
                Thread.sleep(2000);
            }
        }
    }
}
