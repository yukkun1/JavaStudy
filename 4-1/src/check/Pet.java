package check;

public class Pet {

	 String name;
	private String masterName;

	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	protected String getName() {
		return this.name;
	}

	protected String getMasterName() {
		return this.masterName;
	}

	public void introduce() {
		System.out.println("■僕の名前は" + name + "です");
		System.out.println("■ご主人様は" + masterName + "です");
	}
}

class RobotPet extends Pet {
	public RobotPet(String name, String masterName) {
		super(name, masterName);
		System.out.println(super.name);
	}

	public void introduce() {
		System.out.println("◇私はロボット。名前は" + super.getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
}