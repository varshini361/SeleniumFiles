package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_108Keys {
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("title is" + driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println("print firsttime down arrow");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		
System.out.println("print firsttime down arrow");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.close();
		
		
	}

}
