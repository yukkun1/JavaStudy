package java_p3;

public class Taxi extends Vehicle implements stopable {

	public Taxi(int customer) {
		this.customer = customer;
	}

	public void show() {
		System.out.println("タクシー乗客:" + customer + "人");
	}

	
	public void stop() {
		System.out.println("ここで降ります。");
	}
}
