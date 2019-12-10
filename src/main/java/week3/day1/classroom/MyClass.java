package week3.day1.classroom;

public class MyClass extends Samsung {
	public static void main(String[] args) {
//		// Redmi mobile class called
//		MyClass redmi = new MyClass();
//		redmi.Calculator();
//		// method overriding camera method
//		redmi.camera();
//		 System.out.println("The OS used in Redmi Mobile is "+redmi.osName("Redmi"));

	//samsung mobile class called
		MyClass sam=new MyClass();
		//cloneApp method is overloaded with one argument
		sam.cloneApp(2);
		//cloneApp method is overloaded with two arguments
		sam.cloneApp(5, "Whatsapp");
		System.out.println("The OS used in Samsung Mobile is "+sam.osName("Samsung"));
		System.out.println(sam.customerCare());
		sam.camera();
		sam.Calculator();
		boolean otgConnectivity = sam.otgConnectivity();
		System.out.println("STATUS OF OTG Connectivity : "+otgConnectivity);

	}
}
