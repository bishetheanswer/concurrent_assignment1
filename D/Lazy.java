package concurrent_assignment1.D;

import java.util.Random;

/**
 * Lazy must: - Extend Thread - Enter in a loop which iterates a random number
 * of times between 2 to 8. - Sleep 1 second - At each iteration, it displays a
 * random message among: “I am dressing up…”, “Just a sec, please…”, or “These
 * clothes do not suit me…”. - If Hurry interrupts Lazy before it is finished,
 * Lazy claims: “That’s not cricket, please play the game!”. - If Lazy finishes
 * before being interrupted, it says “I am ready, the early bird catches the
 * worm!”.
 *
 * @author yournamehere
 *
 */
public class Lazy extends Thread {

    Random ran = new Random();
    int n;
    int j;
    int x = 0;

    public void run() {
        n = ran.nextInt(7 + 2);

        for (int i = 0; i < n && !Thread.interrupted(); i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception E) {
                interrupt();
            }
            if (!Thread.interrupted()) {

                j = ran.nextInt(3);
                switch (j) {
                    case 0:
                        System.out.println("I am dressing up…");
                        break;
                    case 1:
                        System.out.println("Just a sec, please…");
                        break;
                    case 2:
                        System.out.println("These clothes do not suit me…");
                        break;

                }
            } else {
                System.out.println("That’s not cricket, please play the game!");
                x = 2;
            }
        }
        if (x != 2) {
            System.out.println("I am ready, the early bird catches the worm!");
        }

    }

}
