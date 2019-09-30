package webdriverprograms;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Program_1 {

	public static void main(String[] args) throws Exception {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
    driver.get("http://127.0.0.1/orangehrm-2.6/index.php");
    Thread.sleep(2000);
    driver.findElement(By.name("txtUserName")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    
    System.out.println("login completed");
    
    driver.findElement(By.linkText("Logout")).click();
    
    System.out.println("logout completed");
    
    driver.close();
    
	}

}
