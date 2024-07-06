package singleton;

/**
 * To implement Lazy Singleton, we must prevent external objects from creating instances of the Single class.
 * Only the singlton class should be responsible to create its own objects.
 *
 * Addtionally we need to provide a method for external objects to access the single object.
 * This can be achieved by making the constructor private and providing a static method for external object to access it
 */

class LazySingleton {
    // This single instance, initially null
    private static LazySingleton instance;

    // Private constructor that prevent instantation
    private LazySingleton () { }

    // Public method to get the instance
    public static LazySingleton getInstance() {
        // First check if the instance is null

        if(instance == null) {
            // if it is null, create a new instance
            instance = new LazySingleton();
        }

        // return the instance
        return instance;
    }
}