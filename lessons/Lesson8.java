package package2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Lesson8 {
	
	@Test
	public void Test() {
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jose.sepulveda\\auto\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.microsoft.com");
		driver.manage().window().maximize();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Microsoft: nube, equipos, aplicaciones y juegos";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		driver.close();
		System.out.println(ActualTitle);
		
	}
}
