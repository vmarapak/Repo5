package automation_first_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Improvement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.homedepot.com");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("http://www.loews.com");
			
			
			driver.quit();
			driver1.quit();
			
			
	}

}
