package week3.assignments;

public abstract class Bike {

	// implemented method
	public void cost(double cost) {
		System.out.println("The cost of the bike is : Rs."+cost);
	}

	// unimplemented method
	public abstract String speed(int speed);
	
}
