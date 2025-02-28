public class Singleton {
    private static Singleton uniqueInstance;
    private static int counter = 0;     private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        counter++;         
        return uniqueInstance;
    }

    public static int getCounter() {
        return counter;  
    }
}