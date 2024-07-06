package singleton;

/**
 * This approach minimizes performance overhead from synchronization by only synchronizing when the object is first created.
 * It uses the volatile keyword to ensure that changes to the instance variable are immediately visible to other threads
 */
public class DoubleCheckedSingleton {

    // the single instance, initially null, marked as volatile
    private static volatile DoubleCheckedSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckedSingleton() { }

    // public method to get the access
    public static DoubleCheckedSingleton getInstance() {
        // first check if the instance is null ( not synchronized )

        if(instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // second check ( synchronized )
                if(instance == null) {
                    // create a new instance
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        // return the instance
        return instance;
    }
}
