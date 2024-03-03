package com_testngScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class irctc {
//	@Test
//	public void bookticket() throws Throwable
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		
		//handle the windows
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> window = allWindow.iterator();
		while (window.hasNext()) {
			
			String winId = window.next();
			String title = driver.switchTo().window(winId).getTitle();
			//System.out.println(title);
			if (title.contains("Bus Ticket Booking")) {
				
				break;
			}
			
		}
		
		String from ="Bengaluru";
		 driver.findElement(By.xpath("//input[@id='departFrom']")).sendKeys(from);
		 //Thread.sleep(2000);
		List<WebElement> departLoc = driver.findElements(By.xpath("//ul[@id='ui-id-1']//div"));
		for (WebElement dloc : departLoc) {
			if(dloc.getText().equals(from)) {
				dloc.click();
				break;
			}
		}
			
			
		
			
			
		
		//driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		 WebElement loc = driver.findElement(By.xpath("//div[@id='ui-id-187']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(loc);
		 
		 driver.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("Chen");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Chennai']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='departDate']")).click();
		 driver.findElement(By.xpath("//a[@class='ui-state-default']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='30']")).click();
		 
		 driver.findElement(By.xpath("//button[.='Search Bus ']")).click();
		 
		 driver.findElement(By.xpath("//h4[text()='Departure Time']/ancestor::div[@class='heading-02-wrap']/descendant::img[@alt='After 6 pm']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[.='Swamy Ayyappa Travels']/ancestor::div[@class='top-search-result-card']/descendant::button[.='Select Seat']")).click();	
		// driver.findElement(By.)
		
	
		
		
		
	
	}
}

	

