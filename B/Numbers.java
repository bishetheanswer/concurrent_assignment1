package concurrent_assignment1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5)
 * and runs them. Can you detect some problem? Can you explain the reason?
 *
 * @author yournamehere
 *
 */
public class Numbers {

    public static void main(String[] args) {
        (new T_PrintID(1)).start();
        (new T_PrintID(2)).start();
        (new T_PrintID(3)).start();
        (new T_PrintID(4)).start();
        (new T_PrintID(5)).start();
    }
} //The problem is that the program doesn't run in order
