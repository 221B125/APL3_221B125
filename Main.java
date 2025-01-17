/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Juet obj=  new Juet();
		obj.setname("Bhavyansh");
		obj.setage(20);
		obj.getname();
		obj.getage();
		
	}
}
 class Juet
{
    String name;
    int age;
    
    void setname(String a){
        this.name=a;
    }
    
    void setage(int b){
        this.age=b;
    }
    void getname(){
        System.out.println("NAME :" +name);
        }
            void getage(){
        System.out.println("AGE :"+age);
        }
    
    
}