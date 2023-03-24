package java_p3;

public class Bus extends Vehicle implements stopable{

	public Bus(int customer) {
		this.customer = customer;
	}

	public void show() {
		System.out.println("バスの乗客:" + customer + "人");
	}

	public void stop() {
		System.out.println("次、降ります。");		
	}

}
