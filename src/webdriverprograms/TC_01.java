package webdriverprograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;


public class TC_01 {



	public static void main(String args[]) throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();//open browser
		
		//driver.get();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");//open URL
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
		
		
	}
}
