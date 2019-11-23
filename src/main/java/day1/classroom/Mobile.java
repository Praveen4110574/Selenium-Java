package day1.classroom;

import cucumber.api.cli.Main;

public class Mobile {

	public String makeCall(long phoneno) {
		return "hello man";
	}
	public boolean sendSms(String name) {
		System.out.println("Hi bro..How are you?");
		return true;
	}
	public void shutDown() {
		System.out.println("The phone is switched off after shutdown is completed");
	}
	public static void main(String[] args) {
		Mobile Realme=new Mobile();
		String makeCall = Realme.makeCall(9940143573L);
		System.out.println(makeCall);
		boolean sendSms = Realme.sendSms("Amma");
		System.out.println(sendSms);
		Realme.shutDown();
	}
}
