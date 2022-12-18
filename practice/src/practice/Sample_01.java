package practice;

public class Sample_01 {
	//フィールド変数？？
	String carmodel;
	String owner;
	String color;
	int speed;
	boolean right;

	//コントラクト（引数なし）
	public Sample_01() {
		System.out.println();
		carmodel = "未登録";
		owner = "未登録";
		color = "未登録";
		speed = 0;
		right = false;
		System.out.println();
	}

	public Sample_01(String carmodel, String owner, String color, int speed, boolean right) {
		this();
		System.out.println();
		this.carmodel = carmodel;
		this.owner = owner;
		this.color = color;
		this.speed = speed;
		this.right = right;
		System.out.println();
	}
}
