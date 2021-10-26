package package2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Lesson10 {
	
	private WebDriver driver;
	private String searchEngineURL;
	private String searchString; 
	


@BeforeMethod 
public void Setup() {
		//Calling the WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jose.sepulveda\\auto\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
		//variables
		driver = new ChromeDriver();
		searchEngineURL = "https://www.google.com";
		searchString = "AgileThought";
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
}

@Test
public void Execution() {
		
		//Launch Search page
		driver.get(searchEngineURL);
		
		//Search for "AgileThought"
		WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.click();
			searchBox.clear();
			searchBox.sendKeys(searchString);
			searchBox.sendKeys(Keys.ENTER);
			
			List<WebElement> listResults = driver.findElements(By.xpath("//div[@data-hveid='CCQQAA']"));
			
			System.out.println(listResults);
						
			
			
}

@AfterMethod
public void Cleanup () {
		driver.close();
}
		
		
	}


