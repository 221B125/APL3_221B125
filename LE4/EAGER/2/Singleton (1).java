public class Singleton{
    private static Singleton uniqueinstance = new Singleton();
    private Singleton(){}
    public static Singleton getinstance(){
        return uniqueinstance;
        
    }
}