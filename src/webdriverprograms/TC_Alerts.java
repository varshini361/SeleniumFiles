package webdriverprograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alerts {
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
  WebDriver driver= new ChromeDriver();
  
  driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
  
  System.out.println("print title" + driver.getTitle());
  
  
  driver.findElement(By.name("txtUserName")).sendKeys("admin");
  
 // driver.findElement(By.name("Submit")).click();
  Thread.sleep(3000);
  
 /* Alert ar=driver.switchTo().alert();
  
  System.out.println(ar.getText());
  
     ar.accept();*/
     
     driver.findElement(By.name("txtPassword")).sendKeys("admin123");
     
     Robot r=new Robot();
     
     r.keyPress(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_TAB);
     
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     
     Thread.sleep(3000);
     
     
     System.out.println("login completed");
    // driver.findElement(By.name("Submit")).click();
     
     Thread.sleep(5000);
     
   
     
     driver.findElement(By.linkText("Logout")).click();
     
     driver.close();
  
  
  
  
  
  
  
		
		
		
	}

}
