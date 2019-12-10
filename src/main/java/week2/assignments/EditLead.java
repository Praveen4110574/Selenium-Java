package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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

		// Enter first name
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item'][2]//input").sendKeys("Navaneth");

		// Click on Find leads button
		driver.findElementByXPath("(//em[@unselectable='on']/button)[7]").click();

		// Click on first resulting lead
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		// driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr[1]//td[1]").click();

		// Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("The tile of the page is verified and its correct as shown: " + title);
		} else
			System.out.println("The title of the page after verification is mismatching");

		// Click Edit button
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']/preceding-sibling::a[1]").click();
		Thread.sleep(3000);

		// Change the company name if only the company name is different from the
		// company name provided by us.
		WebElement companyName = driver.findElementById("updateLeadForm_companyName");
		if (!(companyName.getAttribute("value").contains("info"))) {
			companyName.clear();
			companyName.sendKeys("info");
			// Click Update
			driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();

			// Confirm the changed name appears
			String companyname = driver.findElementById("viewLead_companyName_sp").getText();
			if (companyname.contains("info")) {
				System.out.println("The company name has been changed to " + companyname + " successfully");
			} else
				System.out.println("The company name has not been changed to " + companyname + " edited by the user");
		}
		// navigate to Find leads page again if the company name provided by us and the
		// company name in the page are matching
		else {
			System.out.println("The company name you wanted to update is already updated with "
					+ companyName.getAttribute("value") + " .So,we are navigating to find leads page again");
			driver.navigate().to("http://leaftaps.com/crmsfa/control/findLeads");
			
			//Close the browser (Do not log out)
			driver.quit();
		}
	}

}
