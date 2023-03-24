package java_p4;

public class Taxi1 extends Car1 {

	public Taxi1(int no) {
		this(no, 0);
	}

	public Taxi1(int no, int price) {
		super(no);
		this.price = price;
	}

	private int price;

	public void start() {
		price = 420;
	}

	public void run() {
		price = price + 80;
	}

	public void display() {
		super.display();
		System.out.println("料金は" + price + "円です");
	}
}
