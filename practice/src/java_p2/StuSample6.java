package java_p2;

public class StuSample6 {

	public static void main(String[] args) {
		TandF tf = new TandF("陸上競技場");
		Football fb = new Football("サッカー部");

		Student6 s6 = new Student6("桜井", tf);
		s6.display();
		s6.practice();

		Student6 s7 = new Student6("菅原", fb);
		s7.display();
		s7.practice();
	}

}
