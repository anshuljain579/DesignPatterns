package singleton;

/**
 * This implementation uses a static inner helper class to hold the singleton instance.
 * The inner class is not loaded into memory until it's referenced for the first time in the getInstance() method.
 */
public class BillPughSingleton {
    // private constructor to prevent instantiation
    private BillPughSingleton() { }

    // Static inner class that holds the instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // public method to get the instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
