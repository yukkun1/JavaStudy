package check;

import constants.Constants;

public class Main {

	//フィールド変数
	private static String firstName = "武田";
	private static String lastName = "信玄";

	public static void main(String[] args) {
        
		printName(firstName, lastName);

		//インスタンス化
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet Pet1 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        
		
		pet.introduce();
		Pet1.introduce();
	}

	private static void printName(String fN, String lN) {
		System.out.println(fN + lN);

	}
}