package concurrent_assignment1.B;

/**
 * Create class T_PrintID which extends Thread:
 *	- It must contain a variable ID whose value is first set through the class constructor.
 *	- Method run() has a loop which iterates 10 times displaying ID.
 *
 * @author yournamehere
 */

public class T_PrintID extends Thread{
    
    String ID;
    
    public T_PrintID(String ID){
        this.ID=ID;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.ID);
        }
    }
}
