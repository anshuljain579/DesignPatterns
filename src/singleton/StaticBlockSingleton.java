package singleton;

/**
 * This is similar to Eager Singleton, but the instance is created in static block.
 * It provides the ability to handle exceptions during instance creation, which is not possible with simple eager initialization
 */
class StaticBlockSingleton {
    // the single instance, initially null
    private static StaticBlockSingleton instance;

    // private constructor to prevent instantation
    private StaticBlockSingleton() { }

    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    // public method to get the instance

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}