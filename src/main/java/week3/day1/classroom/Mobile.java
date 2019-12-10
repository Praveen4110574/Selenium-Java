package week3.day1.classroom;

public class Mobile {

	public String osName(String os) {
		if (os.contains("Redmi"))
			return "Android";
		else if (os.contains("Samsung"))
				return "Samsung OS"; 
		else
			return "OS not found";
	}

	public void Calculator() {
		System.out.println("calculation done");
	}

	public boolean otgConnectivity() {
		return true;
	}

	public void camera() {
		System.out.println("normal camera");
	}

}