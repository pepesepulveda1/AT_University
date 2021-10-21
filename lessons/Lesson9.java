package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jose.sepulveda\\auto\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		System.out.println("Window maximized");

		WebElement find2 = driver.findElement(By.name("login"));
		find2.click();
		System.out.println("Clicked login");

		WebElement find1 = driver
				.findElement(By.xpath("//*[@href='https://www.facebook.com/recover/initiate/?ars=facebook_login']"));
		find1.click();
		System.out.println("Clicked Forgot PW");

		WebElement find3 = driver.findElement(By.name("did_submit"));
		find3.click();
		System.out.println("Clicked Search");

		driver.navigate().back();
		driver.close();

	}

}
