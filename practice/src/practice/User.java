package practice;

class User {
	private String username;
	private int id;
	private String password;

	public User(String username, int id, String password) {
		this.username = username;
		this.id = id;
		this.password = password;
	}
	protected void printAccountInfo() {
		System.out.println("ユーザー名は、" + this.username);
		System.out.println("IDは、" + this.id);
		System.out.println("パスワードは、" + this.password);

	}
}
