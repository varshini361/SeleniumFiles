package webdriverprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_110Robotclass {
	
	public static String un="admin";
	public static String pw="admin123";
	
	
	public static void main(String args[]) throws Exception {
		
		

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			
			
			System.out.println("titl is matched");
		}
		else {
			System.out.println("titile not matched  and Title is "+ driver.getTitle());
		}
		
		assertTrue(driver.findElement(By.className("bodyTXT")).getText().equals("Login Name :"));
		
		System.out.println("title matched" +driver.getTitle());
		
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		
		
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("login completed");
		
		WebElement element=driver.findElement(By.linkText("Admin"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).perform();
		 Thread.sleep(3000);
	      
		  
		  WebElement element1=driver.findElement(By.linkText("Data Import/Export"));
		  
		  action.moveToElement(element1).perform();
		  
		  Thread.sleep(3000);
	      
		  
		  driver.findElement(By.linkText("Export")).click();
		  
		  
		       Thread.sleep(3000);
		       driver.switchTo().frame("main-content");
		       Select dropdwn=new Select(driver.findElement(By.id("cmbExportType")));
		       
		       dropdwn.selectByIndex(1);
		       
		       driver.findElement(By.xpath("//*[@id=\"btnExport\"]")).click();
		       
		       driver.switchTo().defaultContent();
		       

				/*Alert a1=driver.switchTo().alert();
				
				driver.findElement(By.)
				
				al.accept();*/
		       
		       
		      // driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
		
		
		
	}

}
