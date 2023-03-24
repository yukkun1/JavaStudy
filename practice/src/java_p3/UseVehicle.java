package java_p3;

public class UseVehicle {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		v[0] = new Taxi(4);
		v[1] = new Train(160);
		v[2] = new Bus(80);

		for (int i = 0; i < v.length; i++) {
			v[i].show();
			if (v[i] instanceof stopable) {
				stopable s = (stopable) v[i];
				s.stop();
			}
		}
	}

}
