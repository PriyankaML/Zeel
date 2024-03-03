package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartSamsung {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	searchBox.sendKeys("tv and appliances", Keys.ENTER);
	
	WebElement tvAndAppliance = driver.findElement(By.xpath("//span[.='TVs & Appliances']"));
	Actions act =new Actions(driver);
	act.moveToElement(tvAndAppliance).perform();
	
	
	
}
}
