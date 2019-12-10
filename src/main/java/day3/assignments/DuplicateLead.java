package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

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

		// Click on Email
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Email']").click();

		// Enter Email
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@xyz.com");

		// click on find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		// Capture name of First Resulting lead
		Thread.sleep(2000);
		String CapturedResult = driver
				.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a").getText();

		// Click First Resulting lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a").click();

		// Click Duplicate Lead
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[1]").click();

		// Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("The title of the webpage " + title + " contains Duplicate Lead wording");
		} else {
			System.out.println("The title of the webpage " + title + " dpes not contain Duplicate Lead wording");
		}

		// Click Create Lead in Duplicate Lead page
		driver.findElementByXPath("//input[@class='smallSubmit']").click();

		// Confirm the duplicated lead name is same as captured name
		String duplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if (CapturedResult.equals(duplicateLeadName)) {
			System.out.println("Duplicate lead is created with first name as :" + duplicateLeadName);
		} else {
			System.out.println("Unique lead is created");
		}
	}

}
