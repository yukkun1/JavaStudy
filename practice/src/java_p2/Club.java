package java_p2;

public abstract class Club {
	private String name;

	public Club(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("部活動:" + name);
	}

	//重要な書き方！！
	public abstract void practice();
}
