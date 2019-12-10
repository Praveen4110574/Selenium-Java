package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open the leaftaps website
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the UserName
		WebElement username = driver.findElementByName("USERNAME");
		username.sendKeys("DemoSalesManager");

		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");

		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads Link
		driver.findElementByLinkText("Leads").click();

		// Click on Find leads link
		driver.findElementByXPath("(//ul[@class='shortcuts']//a) [3]").click();

		// Click on Phone
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='x-tab-strip-text ']) [2]").click();

		// Enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("8056130497", Keys.TAB);

		// Click find leads button
		driver.findElementByXPath("(//em[@unselectable='on']/button)[7]").click();

		// Lead ID of first resulting lead is captured
		Thread.sleep(2000);
		String text = driver
		.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(text);
		
		// Click on first resulting lead
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		//Click Delete 		
		driver.findElementByXPath("(//a[@class='subMenuButtonDangerous'])[1]").click();

		// Click Find leads
		driver.findElementByXPath("(//ul[@class='shortcuts']//a) [3]").click();

		// Enter captured lead ID
		driver.findElementByName("id").sendKeys(text);
		Thread.sleep(5000);

		// Click find leads button
		driver.findElementByXPath("(//em[@unselectable='on']/button)[7]").click();
		Thread.sleep(5000);

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		//System.out.println(text2);
		//boolean contains = text2.contains("No records to display");
		//System.out.println(contains);
		if ((text2.contains("No records to display"))) {
			System.out.println("The record is successfully deleted");
		} else {
			System.out.println("The record is present and not deleted. So,we are navigating to find leads page again");
			driver.navigate().to("http://leaftaps.com/crmsfa/control/findLeads");
		}

		// Close the browser (Do not log out)
		driver.quit();

	}

}
