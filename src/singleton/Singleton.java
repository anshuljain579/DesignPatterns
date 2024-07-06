package singleton;

public class Singleton {

    // Static variable to hold the single instance
    private static volatile Singleton instance;

    // private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance creating");
        if(instance != null) {
            throw new RuntimeException("Error");
        }
    }

    // to avoid serialization issue
    protected Object readResolve() {
        return getInstance();
    }


    // To avoid clone issue
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("Cannot not this instance");
    }

    // static method to get the single instance of Singleton class
    public static Singleton getInstance() {

        // to handle Multithreading issue
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        System.out.println("Fetching instance");
        return instance;
    }
}
