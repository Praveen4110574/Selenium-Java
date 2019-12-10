package week3.day2.classroom;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TEST LEAF JAVA SELENUM\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.TAB);
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("SBC", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		// locate the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

		// table[@class='DataTable TrainList TrainListHeader']//td[2]

		// Get all rows of the table by tagname tr
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// Get the no.of rows in the table
		int rowsize = rows.size();

		// create arraylist to store the train numbers
		List<String> TrainNameList = new ArrayList<>();

		// create arraylist to store the train names
		List<String> TrainNumberList = new ArrayList<>();

		System.out.println("The train names betwen Chennai and Bangalore in are : ");
		for (int i = 1; i <= rowsize - 1; i++) {

			// get all columns of the row
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

			// Train Name column(column number 2)
			String column2TrainName = columns.get(1).getText();

			// Print all the train Names
			System.out.println(column2TrainName);

			// Train names list
			TrainNameList.add(column2TrainName);
		}
		System.out.println("The train numbers betwen Chennai and Bangalore are : ");
		for (int j = 1; j <= rowsize - 1; j++) {

			// get all columns of the row
			List<WebElement> columns = rows.get(j).findElements(By.tagName("td"));

			// Train Number column(column number1)
			String column1TrainNumber = columns.get(0).getText();

			// Print all the train numbers
			System.out.println(column1TrainNumber);

			// Train number list
			TrainNumberList.add(column1TrainNumber);
		}

		// create a set for TrainName and assign Train name list values to the set.
		Set<String> TrainNameSet = new LinkedHashSet<>(TrainNameList);

		// add all elements in TrinName list to Train Name set.
//		TrainNameSet.addAll(TrainNameList);

		// get size of the set TrainName
		TrainNameSet.size();

		// get size of the list TrainName
		TrainNameList.size();

		// compare the size of the Train Name lsit and Train Name set
		if ((TrainNameSet.size()) == (TrainNameList.size())) {
			System.out.println("There are no duplicates in the Train Name column");
		} else {
			System.out.println("There are  duplicates in the Train Name column");
		}

		// create a set for TrainNumber and assign Train number list values to the set.
		Set<String> TrainNumberSet = new LinkedHashSet<>(TrainNumberList);

		// add all elements in TrinName list to Train Name set.
		// TrainNumberSet.addAll(TrainNumberList);

		// get size of the set TrainName
		TrainNumberSet.size();

		// get size of the list TrainName
		TrainNumberList.size();

		// compare the size of the Train Name list and Train Name set.If both list size
		// and set size are sae,then values are unique.elseduplicates are present.
		if ((TrainNumberSet.size()) == (TrainNumberList.size())) {
			System.out.println("There are no duplicates in the Train Number column");
		} else {
			System.out.println("There are  duplicates in the Train Number column");
		}
	}

}
