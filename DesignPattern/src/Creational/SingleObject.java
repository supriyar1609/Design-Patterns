package Creational;

public class SingleObject {
		static  SingleObject obj = new SingleObject();

	   private SingleObject(){}

	   public static  SingleObject getObj(){
	      return obj;
	   }

	   public void show(){
	      System.out.println("This is Singleton class");
	   }
}