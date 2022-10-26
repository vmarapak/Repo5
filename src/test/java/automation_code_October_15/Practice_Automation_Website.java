package automation_code_October_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Automation_Website {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://automationpractice.com");


driver.findElement(By.name("search_query")).sendKeys("shirt");
driver.findElement(By.name("submit_search")).click();
driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a")).click();	
//use xpath when cant use regular htmllocators for java like "id","name","class","className"
driver.findElement(By.name("Submit")).click();


	}

}
