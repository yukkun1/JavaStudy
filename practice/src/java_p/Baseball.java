package java_p;

public class Baseball implements Englishable {

	public void display() {
		System.out.println("キャッチボール");
		System.out.println("シートノック");
		System.out.println("バッティング");
	}

	@Override
	public void displayEng() {
		System.out.println(Englishable.Language);
		System.out.println("catch ball");
		System.out.println("seat knock");
		System.out.println("batting practice");
	}

}
