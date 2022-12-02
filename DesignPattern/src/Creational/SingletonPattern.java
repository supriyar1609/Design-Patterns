package Creational;
class Employee{

}
public class SingletonPattern {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getObj();
		System.out.println(object.hashCode());
				   
//		SingleObject object2 = new SingleObject();
				   
		SingleObject object1 = SingleObject.getObj();
		System.out.println(object1.hashCode());



		object.show();
//		object2.showMessage();
		Employee e1=new Employee();
		System.out.println(e1.hashCode());

		Employee e2=new Employee();
		System.out.println(e2.hashCode());

		}
}