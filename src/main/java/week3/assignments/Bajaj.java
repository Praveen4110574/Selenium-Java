package week3.assignments;

public class Bajaj extends Bike {

	@Override
	public String speed(int speed) {
System.out.println("The speed at which you are riding the bike is :"+speed);
		if (speed <= 0)
			return "Idle mode";
		else if (speed > 0 && speed <= 40)
			return "Safe Mode";
		else if (speed > 40 && speed <= 60)
			return "Mileage Mode";
		else if (speed > 60 && speed <= 90)
			return "Highway Mode/Performance Mode";
		else
			return "Rash driving";

		
	}
public static void main(String[] args) {
	Bike bike=new Bajaj();
	bike.cost(73000);
	String mode = bike.speed(40);
	System.out.println("You are driving the bike in this Mode: "+mode);
}
}
