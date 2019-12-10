package day4.classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS",Keys.TAB);
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("Delhi",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		//locate the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		for (int i = 0; i <= rowsize-1; i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			System.out.println(columns.get(1).getText());
		}
		
		//driver.findElement(By.xpath("//a[contains(text(),'TAMIL NADU EXP')]")).click();
		List<WebElement> column = table.findElements(By.tagName("td"));
		for (int i = 0; i <= column.size()-1; i++) {
			List<WebElement> row = column.get(i).findElements(By.tagName("tr"));
			System.out.println(row.get(1).getText());
		}
	}

}
