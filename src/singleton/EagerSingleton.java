package singleton;

/**
 * In EagerSingleton, we rely on the JVM to create the singleton instance when the class is loaded.
 * The JVm guarantees that the instance wil be created before any thread access the instance variable.
 */

class EagerSingleton {
    // the single instance, created immediately
    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor to prevent instantation
    private EagerSingleton() { }

    // Public method to get the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}