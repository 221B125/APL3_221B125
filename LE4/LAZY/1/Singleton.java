public class Singleton{
    private static Singleton uniqueinstance;
    private Singleton(){}
    public static Singleton getinstance(){
        if(uniqueinstance==null)
        uniqueinstance=new Singleton();
        return uniqueinstance;
    }
}