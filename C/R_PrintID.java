package concurrent_assignment1.C;
/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author Mario Berlanga Serrano, Miguel Enrique Játiva Jiménez, Juan Gabriel Jiménez Lagos
 *
 */

import java.util.Random;

public class R_PrintID implements Runnable{
    int ID;
    
    public R_PrintID(int ID){
        this.ID=ID;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.ID);
        }
    }
}
