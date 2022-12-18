package practice1;

public class Practice_02 {
	private String name;
	private String gender;
	private int length;
	private int weight;
	private String skill;
	private String hobby;

	//コントラクタ
	public Practice_02() {
		this.name = "ダニエル";
		this.gender = "男";
		this.length = 180;
		this.weight = 85;
		this.skill = "睡眠";
		this.hobby = "テニス";
	}

	public void sales() {
		System.out.println(this.name);
	}

	public void rest() {
		System.out.println(this.hobby);
	}

	public String skill() {
		// TODO 自動生成されたメソッド・スタブ
		return this.skill;
	}

}
