package automation_first_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email_Websites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver1 = new FirefoxDriver();
	driver1.manage().window().maximize();
	driver1.get("http:/www.yahoomail.com");
	
	driver.quit();
	driver1.quit();
	
		
		
		
	}

}
