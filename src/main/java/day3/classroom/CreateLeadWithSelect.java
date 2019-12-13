package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
//Enter the UserName
		WebElement username = driver.findElementByName("USERNAME");
		username.sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Reliance");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Aravind");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Loganathan");
		// Select 'Source' as 'Other' (Handling DropDown)
		WebElement sourcedd = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown1 = new Select(sourcedd);
		dropdown1.selectByVisibleText("Direct Mail");

//Select Marketing campaign dropdown value using selectbyindex
		Select dropdown2 = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		List<WebElement> options = dropdown2.getOptions();
		int optionnumber = options.size();
		dropdown2.selectByIndex(optionnumber - 4);
//select industry dropdown value by selectby value method
		Select dropdown3 = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		dropdown3.selectByValue("IND_DISTRIBUTION");
//Select last value present in Preferred currency dropdownbox byselectbyIndex method
		Select dropdown4 = new Select(driver.findElementByName("currencyUomId"));
		List<WebElement> options2 = dropdown4.getOptions();
		int size = options2.size();
		dropdown4.selectByIndex(size - 1);
//print all the values present in ownership dropdown box 
		Select dropdown5 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		List<WebElement> options3 = dropdown5.getOptions();
		//int size2 = options3.size();
		System.out.println("The values present in the ownership dropdown box is");
		for (WebElement c : options3) {
			System.out.println(c.getText());
		}
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name

	}

}
