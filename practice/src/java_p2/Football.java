package java_p2;

public class Football extends Club {

	public Football(String name) {
		super(name);
	}

	@Override
	public void practice() {
		System.out.println("ドリブル練習");
		System.out.println("シュート練習");
		System.out.println("ミニゲーム");
	}

}
