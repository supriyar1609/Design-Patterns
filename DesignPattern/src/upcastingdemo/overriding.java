package upcastingdemo;
class Parent{
	void phone() {
		System.out.println("Samsung");
	}
}
class Child extends Parent{
	//child has defined the new implementation
	void phone() {
		System.out.println("iphone");
	}
}
public class overriding {
	public static void main(String[] args) {
	Child child = new Child();
	child.phone();
	}

}