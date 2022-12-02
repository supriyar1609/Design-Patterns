package upcastingdemo;
class RBIBank{
	int rateOfInterset() {
		return 3;
	}
}
class SBI extends RBIBank{
	int rateOfInterset() {
		return 5;
	}
	void holiday() {
		System.out.println("Sat sun holiday");
	}
}
class Kotak extends RBIBank{
	
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		//upcasting
		//reference of parent, objectof child
		RBIBank bank = new SBI();
		System.out.println(bank.rateOfInterset());
		//System.out.println(bank.holiday());
	

	}

}