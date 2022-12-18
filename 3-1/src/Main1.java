public class Main1 {

	public static void main(String[] args) {
		int[] data = { 2, 22, 3, 14, 95, 7, 5, 9, 8, 13, 35, 59, 97, 57 };
		for (int i = 0; i < data.length; i++) {
			if (judgeBool(data[i])) {
				System.out.println(data[i] + "は素数です！");
			}
		}
	}

	public static boolean judgeBool(int num) {
		if (num == 2 || num == 3) {
			return true;
		}

		for (int n = 2; n < num / 2; n++) {

			if (num % n == 0) {
				return false;
			}
		}
		return true;
	}
}