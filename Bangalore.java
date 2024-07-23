package Collection;

class Delhi {
	void vehicle() {
System.out.println("VEHICLE");
	}

	void busses() {
System.out.println("BUSSES");
	}
}

public class Bangalore extends Delhi {
	void add() {

	}

	public static void main(String[] args) {
		Delhi d1 = (Delhi)new Bangalore();
		d1.vehicle();
		d1.busses();

	}

}

//
