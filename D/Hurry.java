package concurrent_assignment1.D;

/**
 * Hurry must: - Be the main thread - Create the Lazy thread. - Wait for Lazy to
 * finish. Each second it must print the message: “Aren’t you ready yet?” and
 * checks if Lazy is finished. - If Lazy isn’t finished after 5 seconds, Hurry
 * will claim “You are resting in your laurels… and I am leaving!” and
 * interrupts Lazy. Then it waits for Lazy to finish. - However, if Lazy
 * finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs
 * rings round you!”.
 *
 * @author Mario Berlanga Serrano, Miguel Enrique Játiva Jiménez, Juan Gabriel Jiménez Lagos
 *
 */
public class Hurry {

    public static void main(String[] args) throws InterruptedException {
        Lazy l = new Lazy();
        l.start();
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (!l.isAlive()) {
                System.out.println("At last, a turtle runs rings round you!");
                j = 2;
                break;
            }

            System.out.println("Aren’t you ready yet?");
            Thread.sleep(1000);
        }
        if (j != 2) {
            System.out.println("You are resting in your laurels… and I am leaving!");
        }
        l.interrupt();
        l.join();
        System.out.println("THE END");
    }
}
