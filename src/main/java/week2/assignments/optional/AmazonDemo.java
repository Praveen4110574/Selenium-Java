package week2.assignments.optional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {

	public static void main(String[] args) {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// aximize the window
		driver.manage().window().maximize();

		// implcit wait for 15 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Launch Amazon URL in chrome browser
		driver.get("https://www.amazon.in/");

		// mouse hover for hello sign in section using Action class and its methods
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElementByXPath("//a[@id='nav-link-accountList']")).build().perform();

		// mouse hover for sign in button
		WebElement signin = driver.findElementByXPath("//a[@id='nav-link-accountList']");
		Actions act2 = new Actions(driver);
		act2.moveToElement(signin).build().perform();

		// click on signin button
		signin.click();

		// input username box
		driver.findElementByXPath("//input[@name='email']").sendKeys("9940461877");

		// click on continue button
		driver.findElementByXPath("//input[@id='continue']").click();

		// input password box
		driver.findElementByXPath("//input[@type='password']").sendKeys("Praveen@4110574");

		// click on signin button
		driver.findElementByXPath("//input[@id='signInSubmit']").click();

		// mouse hover for menu icon
		driver.findElementByXPath("//a[@id='nav-hamburger-menu']").click();
		Actions act3 = new Actions(driver);
		act3.moveToElement(driver.findElementByXPath("//a[@id='hmenu-customer-profile-link']")).build().perform();

		// click on menu icon
		driver.findElementByXPath("//a[@id='hmenu-customer-profile-link']").click();

		// click on order link
		driver.findElementByXPath("(//div[@class='a-box ya-card--rich']) [1]").click();

		// click order dropdown button
		driver.findElementByXPath("//span[@class='a-button a-button-dropdown order-filter-dropdown']").click();

		/*
		 * select last 30 days option from order dropdown by mouse hovering and clicking
		 * on that option
		 */
		Actions act4 = new Actions(driver);
		act4.moveToElement(driver.findElementByXPath("//a[@class='a-dropdown-link']")).build().perform();
		driver.findElementByXPath("//a[@class='a-dropdown-link']").click();

		// click on invoice link
		driver.findElementByXPath("(//span[@class='a-declarative']/a) [2]").click();

		// click on bill1 link
		driver.findElementByXPath("//a[contains(text(),'            Invoice  1')]").click();

	}

}
