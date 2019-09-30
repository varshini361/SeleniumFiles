package webdriverprograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;


public class TC_104Facebook {
	
	
	
	public static void main(String args[])throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afc1unttLDI5qDIFI-E3YScjBoyR6irfrZAc9PCmdMAlpgJymdpqCHnglg4zEeM5E6q63RkKPg1ka4E3qUBsodaa8c9vQjqY-t14t-JUN7f7jQ&smuh=34406&lh=Ac9pSSWldkxjapM4");
		
		driver.findElement(By.name("email")).sendKeys("anitharam.cheekuri@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("cheekuri");
		
		 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
		
		
		Thread.sleep(3000);
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]"));
		
		
		//Actions action=new Actions(driver);
		
		//action.moveToElement(element).perform();
		
		
		
		 Robot r=new Robot();
	     
	     r.keyPress(KeyEvent.VK_TAB);
	     r.keyRelease(KeyEvent.VK_TAB);
	     
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     
	     
		
		/*WebElement element=driver.findElement(By.linkText("New Groups"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).perform();*/
		
		/*driver.findElement(By.linkText("New Groups")).click();
		
		driver.findElement(By.linkText("Messenger")).click()*/
		
		
		//driver.findElement(By.id("userNavigationLabel")).click();
	}

}
