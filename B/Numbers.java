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
        for (int i = 1; i < 6; i++) {
            (new T_PrintID(i)).start();
        }
    }
} //The problem is that the program doesn't run in order
