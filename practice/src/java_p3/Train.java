package java_p3;

public class Train extends Vehicle {

	public Train(int customer) {
		this.customer = customer;
	}

	public void show() {
		System.out.println("電車の乗客:" + customer + "人");
	}
}
