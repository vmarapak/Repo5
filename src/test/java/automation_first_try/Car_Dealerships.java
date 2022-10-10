package automation_first_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Car_Dealerships {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.com");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver fire = new FirefoxDriver();
		fire.manage().window().maximize();
		fire.get("https://www.honda.com");
		
		driver.quit();
		fire.quit();
		

	}

}
