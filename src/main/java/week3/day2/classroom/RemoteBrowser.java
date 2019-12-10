package week3.day2.classroom;

public class RemoteBrowser implements Browser {

	@Override
	public void locateElement(String locator) {
		System.out.println("The locator "+locator+ " is found");
		
	}

	@Override
	public String getTitle() {
		
		return "Flipkart";
	}

	@Override
	public void close() {
		
		System.out.println("The browser is closed");
		
	}
public static void main(String[] args) {
	
	Browser br=new RemoteBrowser();
	br.locateElement("//tag[@class='classname']");
	String title = br.getTitle();
	System.out.println("The title of the webpage is : "+title);
	br.close();
}
	
	
}
