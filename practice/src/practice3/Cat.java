package practice3;

public class Cat {
	private String name;
	public int age;

	public Cat(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public void showName() {
		System.out.println(this.name);
	}

	public void showAge() {
		System.out.println(this.age);
	}

	public void agePlus() {
		age++;
	}

}
