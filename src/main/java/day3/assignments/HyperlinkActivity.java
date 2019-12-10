package day3.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		
		//Playing with hyperlink
		//Go to Homepage
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("User is navigated to Home page");
		
		driver.navigate().back();
		System.out.println("User is navigated back to Hyperlink page");
		
		//Find where am supposed to go without clicking me? -use getAttribute() method and href attribute value
		System.out.println("Iam supposed to go to this link :"+driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));

		//Verify am I broken?-to verify whether the link is broken by inputting href attribute for getAttribute() method and getting that value.
	String upcominglink = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a").getAttribute("href");
	if(upcominglink.contains("error")) {
		System.out.println("The link is broken");
	}
		else
			System.out.println("The link is up and running");
	
	//Go to Home Page-(Interact with same link name)
	System.out.println("Navigating to HomePage");
	driver.findElementByLinkText("Go to Home Page").click();
	System.out.println("User is navigated to Home page");
	
	//How many links are available in this page?
	List<WebElement> homePageLinks = driver.findElementsByTagName("a");
	int size = homePageLinks.size();
	System.out.println("The no.of links present in Homepage is "+size);
	
	//Printing the link names present in HomePage
	System.out.println("The name of links present in homePage are : ");
	for (WebElement eachHomePageLink : homePageLinks) {
		System.out.println(eachHomePageLink.getText());
	}
	}

}
