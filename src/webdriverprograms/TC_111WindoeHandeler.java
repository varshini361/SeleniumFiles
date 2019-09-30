package webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;


 class TC_111WindoeHandeler {
	
	public static  void main(String args[]) throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/SELENIUM%20Software/HtmlFiles/multiplewindows.html");
		
		driver.findElement(By.id("btn2")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn3")).click();
		
		ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(wind.get(0));
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
	}

}
