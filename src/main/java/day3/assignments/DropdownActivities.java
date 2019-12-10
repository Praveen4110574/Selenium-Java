package day3.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//Select training program dropdown by using  Index
		Select dropdown1=new Select(driver.findElementById("dropdown1"));
		dropdown1.selectByIndex(3);
		//Select training program dropdown value using visible Text present in the option
		Select dropdown2=new Select(driver.findElementByName("dropdown2"));
		dropdown2.selectByVisibleText("Appium");
		//Select training program dropdown value using value present in the option
		Select dropdown3=new Select(driver.findElementById("dropdown3"));
		dropdown3.selectByValue("4");
		//Get the number of dropdown options
		Select dropdown4=new Select(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		List<WebElement> options = dropdown4.getOptions();
		System.out.println("The number of options present in the dropdown box 4 is : "+options.size());
		// use sendKeys to select value in dropdown
		driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select").sendKeys("Selenium");
		//list box selection
		//select checkbox options in select your programs list box by using multiple tag(List Box)
		Select dropdown5=new Select(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		dropdown5.selectByValue("1");
		dropdown5.selectByIndex(3);
		dropdown5.selectByVisibleText("Loadrunner");
	}

}
