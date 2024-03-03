package calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class redbusTest {
//@Test
//public void redBusTest()
	public static void main(String[] args) {
		

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	//driver.switchTo().alert().accept();
	WebElement fromel=driver.findElement(By.xpath("//input[@id='src']"));
	
	fromel.click();
	
	fromel.sendKeys("Bangalore",Keys.ENTER);
	WebElement toEle = driver.findElement(By.xpath("//input[@id='dest']"));
	toEle.click();
	toEle.sendKeys("chennai",Keys.ENTER);
//	
	driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']")).click();
//	
	
	
}
}
