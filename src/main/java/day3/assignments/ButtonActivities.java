package day3.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");
//Click button to travel home page
driver.findElementByXPath("//*[@id=\"home\"]").click();
driver.navigate().back();
//Find position of Get Position button (x,y)
System.out.println(driver.findElementByXPath("//*[@id=\"position\"]").getLocation());
//get x coordinate position of Get Position button
System.out.println(driver.findElementByXPath("//*[@id=\"position\"]").getLocation().getX());
//Find button background colour of What clor am I? button
System.out.println(driver.findElementByXPath("//*[@id=\"color\"]").getCssValue("background-color"));
//Find button colour of What clor am I? button
System.out.println(driver.findElementByXPath("//*[@id=\"color\"]").getCssValue("color"));
//Find the height and width of the What is my size button
System.out.println(driver.findElementByXPath("//*[@id=\"size\"]").getSize());
//Find the width of the What is my size button
System.out.println(driver.findElementByXPath("//*[@id=\"size\"]").getSize().getWidth());
	}

}
