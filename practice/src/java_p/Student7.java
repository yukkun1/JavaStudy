package java_p;

public class Student7 implements Englishable {

	private String name;

	public Student7(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("名前" + name);
	}

	@Override
	public void displayEng() {
		System.out.println(Englishable.Language);
		System.out.println("Name:" + name);
	}

}
