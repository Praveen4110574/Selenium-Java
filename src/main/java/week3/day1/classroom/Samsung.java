package week3.day1.classroom;

public class Samsung extends Mobile {

	public String customerCare() {
		return "Samsung customer care is Excellent";
	}
	
	public void cloneApp(int noOfApps) {
		System.out.println("The no .of apps clonable is "+noOfApps);
	}
	
	public void cloneApp(int noOfApps,String appName) {
		System.out.println("The no .of apps clonable is "+noOfApps);
		System.out.println("The app cloned is "+appName);
	}
}
