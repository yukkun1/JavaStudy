package practice;

public class Sample_02 {

	public static void main(String[] args) {
		Sample_01 myCar = new Sample_01();
		Sample_01 yourCar = new Sample_01("君", "私", "red", 100, true);
		Sample_01 otherCar = new Sample_01("wa", "we", "white", 50, true);

		
		System.out.println("<myCar>");
		System.out.println(myCar.carmodel);
		System.out.println(myCar.owner);
		System.out.println(myCar.color);
		System.out.println(myCar.speed);
		System.out.println(myCar.right);
		
		System.out.println("<yourCar>");
		System.out.println(yourCar.carmodel);
		System.out.println(yourCar.owner);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.right);
		
		System.out.println("<otherCar>");
		System.out.println(otherCar.carmodel);
		System.out.println(otherCar.owner);
		System.out.println(otherCar.color);
		System.out.println(otherCar.speed);
		System.out.println(otherCar.right);
		
	}

}
