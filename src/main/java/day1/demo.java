package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TEST LEAF JAVA SELENUM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
	}

}
