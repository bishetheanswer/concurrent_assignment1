package concurrent_assignment1.C;

import concurrent_assignment1.B.T_PrintID;
import java.util.Random;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5)
 * and runs them.
 *
 *
 * @author yournamehere
 *
 */
public class Numbers{

    public static void main(String[] args) throws InterruptedException {
        Random ran = new Random();
        
        for (int i = 1; i < 6; i++) {
            (new Thread(new R_PrintID(i))).start();
            Thread.sleep(ran.nextInt(1000));
        }

    }
}
