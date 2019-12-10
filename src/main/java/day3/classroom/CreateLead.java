package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

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
		
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("DEF");
		
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("GHI");
		
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		
		// Verify the Lead is created by checking the Company or First Name OR LAST NAME
		String comName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		String lastName = driver.findElementById("viewLead_lastName_sp").getText();
		
		if((comName.contains("ABC")) && (firstName.equalsIgnoreCase("DEF")) && (lastName.equalsIgnoreCase("ghi"))){
			System.out.println("The lead is created successfully with the correct details as follows : Company Name: "+comName+" First Name: "+firstName+" Last name: "+lastName);
		}
		else {
			System.out.println("The lead is created with incorrect details as follows: Company Name: "+comName+" First Name: "+firstName+" Last name: "+lastName );
		}
	}

}
