package automation_code_October_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
public static WebDriver driver;

public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com");

driver.findElement(By.id("email")).sendKeys("2405952624");
driver.findElement(By.name("pass")).sendKeys("Ruby@2020");
driver.findElement(By.name("login")).click();
driver.quit();

	
	}

}
