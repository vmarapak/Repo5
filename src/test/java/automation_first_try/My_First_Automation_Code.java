package automation_first_try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class My_First_Automation_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://BMW.com");
		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://twitter.com");
		driver2.manage().window().maximize();
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://gmail.com");
		driver3.manage().window().maximize();
		
		
		
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://youtube.com");
		
	}

}
