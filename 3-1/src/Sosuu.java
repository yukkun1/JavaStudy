public class Sosuu {

	public static void main(String[] args) {
		int[] n = { 22, 3, 14, 95, 7, 5, 9, 8, 13, 35, 59, 97, 57 };

		boolean sosu = true;
		for (int i = 2; i < n[i]; i++) {
			if (n[i] % i == 0)
				sosu = false;
			break;
		}

		if (sosu) {
			System.out.println();
		} else {
			System.out.println();
		}

	}
}
