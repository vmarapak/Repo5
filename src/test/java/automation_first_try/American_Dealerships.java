package automation_first_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class American_Dealerships {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.ford.com");
	
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver1 = new FirefoxDriver();
	driver1.manage().window().maximize();
	driver1.get("http://www.dodge.com");

	driver.quit();
	driver1.quit();
	
	}

}
