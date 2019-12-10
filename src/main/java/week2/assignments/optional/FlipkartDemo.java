package week2.assignments.optional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implcit wait for 15 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Launch Flipkart URL in chrome browser
		driver.get("https://www.flipkart.com/");

		// close the login alert box using * button
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();

//Hover the cursor on Electronics

		Thread.sleep(3000);
		Actions electronicsMouseHover = new Actions(driver);
		WebElement electronics = driver.findElementByXPath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]");
		electronicsMouseHover.moveToElement(electronics).perform();

// Click on Mi link under electronics
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[contains(text(),'Mi')])[1]").click();
		
//Verify title contains Mi Mobile
		Thread.sleep(2000);
		String title = driver.getTitle();
		if (title.contains("Mi Mobile")) {
			System.out.println("The title of the page is : " + title + " and it contains the word Mi Mobile ");
		} else {
			System.out.println("The title of the page is : " + title + "and it does not contain the word Mi Mobile ");
		}
		
// Print all the phone names
		System.out.println("The MI phones displayed in the flipkart current page are : ");
		List<WebElement> phoneNames = driver.findElementsByXPath("//div[@class='_3wU53n']");
		for (WebElement eachPhoneName : phoneNames) {
			System.out.println(eachPhoneName.getText());
		}
		
// Close the Browser
		driver.quit();
	}

}
