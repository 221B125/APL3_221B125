public class Main {
    public static void main(String[] args) {
       Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();

  System.out.println("getInstance was called " + Singleton.getCounter() + " times");
    }
}
