package singleton;

/**
 * This is the similar approach to Lazy initialization but also ensures that the singleton is thread safe.
 *
 * This is achieved by makeing the getInstance() method synchronized ensuring only one thread can execute this method at a time.
 *
 * When a thread enters the synchronized method, it acquires a lock on the class object
 * so other thread must wait until the method is executed.
 */
class ThreadSafeSingleton {
    // The Single instance, initially null
    private static ThreadSafeSingleton instance;

    // Private constructor to prevent instantation
    private ThreadSafeSingleton() { }

    // public method to get the instance, with synchronized keyword
    public static synchronized ThreadSafeSingleton getInstance() {
        // first check if the instance is null
        if(instance == null) {
            // if it is null, create a new instance
            instance = new ThreadSafeSingleton();
        }
        // return the instance
        return instance;
    }
}