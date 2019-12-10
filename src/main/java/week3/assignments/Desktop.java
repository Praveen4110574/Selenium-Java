package week3.assignments;

public class Desktop implements Hardware, Software {
	// Create a Class Desktop with method desktopModel()

	public String desktopModel() {
		System.out.println("Desktop Mode");
		return "DM-VERSION-15.0.0.12";
	}

	@Override
	public void softwareResources() {
		System.out.println("SOFTWARE MODE");

	}

	@Override
	public void hardwareResources() {
		System.out.println("HardwareMode");

	}

	public static void main(String[] args) {
		// calling Hardware interface's method which is implemented using Desktop class
		Hardware hd = new Desktop();
		hd.hardwareResources();

		// calling software interface's method which is implemented using Desktop class
		Software so = new Desktop();
		so.softwareResources();

		// calling methods in Software,Hardware Interface along with Desktop class
		// method using Desktop class
		Desktop ds = new Desktop();
		String desktopModel = ds.desktopModel();
		System.out.println("The desktop model is : " + desktopModel);
		ds.hardwareResources();
		ds.softwareResources();
	}
}
