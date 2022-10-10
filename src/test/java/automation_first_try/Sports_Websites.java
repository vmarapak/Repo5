package automation_first_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sports_Websites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://espn.com");
		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://nfl.com");
		driver3.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://nba.com");
		driver1.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://yahoosports.com");
		driver2.manage().window().maximize();
		
		
		driver.quit();
		driver1.quit();
		driver2.quit();
		driver3.quit();
		
	}

}
