package week2.assignments.optional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open the leaftaps website
		driver.get("https://www.redbus.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter From (Chennai) and Tab
		driver.findElementByXPath("//input[@class='db'and @id='src']").sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@class='db'and @id='src']").sendKeys(Keys.TAB);
		driver.findElementByXPath("//input[@class='db'and @id='dest']").sendKeys("Trichy");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@class='db'and @id='dest']").sendKeys(Keys.TAB);

		// Click on current date
		driver.findElementByXPath("//label[@class='db text-trans-uc move-up'and @for='onward_cal']").click();
		Thread.sleep(1000);
		WebElement currentDate = driver.findElementByXPath("(//td[@class='current day'])[2]");
		Actions act1 = new Actions(driver);
		act1.pause(2000).moveToElement(currentDate).click(currentDate).perform();

		// Click on Return Date and click the current date as return date
		driver.findElementByXPath("//label[@class='db text-trans-uc tal'and @for='return_cal']").click();
		Thread.sleep(1000);
		WebElement returnDate = driver
				.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[4]//td[@class='current day']");
		Actions act2 = new Actions(driver);
		act2.pause(2000).moveToElement(returnDate).click(returnDate).perform();

		// Click Search Buses
		driver.findElementByXPath("//button[@id='search_btn']").click();

		// Click After 6 PM checkbox
		Thread.sleep(5000);
		WebElement after6pm = driver.findElementByXPath("//label[@class='custom-checkbox' and @for='dtAfter 6 pm']");
		boolean selected = after6pm.isSelected();
		boolean enabled = after6pm.isEnabled();
		if ((selected == false) && (enabled == true)) {
			after6pm.click();
		} else
			System.out.println(
					"The checkbox after6-pm is already selected or the checkbox is disabled.So,we are not doing any action on this checkbox");

		// Click Bus Type (AC) Checkbox
		Thread.sleep(3000);
		WebElement acBusType = driver.findElementByXPath("//label[@class='custom-checkbox' and @for='bt_AC']");
		boolean selected1 = acBusType.isSelected();
		boolean enabled1 = after6pm.isEnabled();
		if ((selected1 == false) && (enabled1 == true)) {
			acBusType.click();
		} else
			System.out.println(
					"The checkbox acBusType is already selected or the checkbox is disabled.So,we are not doing any action on this checkbox");

		// Print number of Private buses found
		Thread.sleep(5000);
		List<WebElement> privateBus = driver.findElementsByXPath("//div[contains(@class,'clearfix row-one')]");
		privateBus.size();
		System.out.println("Total no.of Private buses :" + privateBus.size());
		// Check whether view government bus button is present.If it is not present then
		// print total bus count equal to private bus count.Else view government bus
		// icon is present, click it and find totalbuscount and government bus count.
		Boolean isPresent = driver.findElementsByXPath("(//div[@class='w-14 fl']//div)[2]").size() > 0;
		if (!isPresent) {
			System.out.println("No Government buses found in this search");
			System.out.println("Total Bus count: " + privateBus.size());
		} else {
			Thread.sleep(2000);
			WebElement viewBusesBtn = driver.findElementByXPath("(//div[@class='w-14 fl']//div)[2]");
			viewBusesBtn.click();
			Thread.sleep(3000);
			List<WebElement> totalBus = driver.findElementsByXPath("//div[contains(@class,'clearfix row-one')]");
			totalBus.size();
			System.out.println("Total bus count: " + totalBus.size());
			System.out.println("Government bus count: " + (totalBus.size() - privateBus.size()));
		}
		// print the bus names
		System.out.println("The bus names available between Chenna and Trichy are : ");
		List<WebElement> busNames = driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
		for (WebElement eachBusName : busNames) {
			System.out.println(eachBusName.getText());
		}
	}

}
