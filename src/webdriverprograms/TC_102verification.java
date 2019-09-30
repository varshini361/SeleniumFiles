package webdriverprograms;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class TC_102verification {
	
	public static void main(String[] args) throws Exception {
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
	     
	     WebDriver driver=new ChromeDriver();//open browser
	    driver.get("http://127.0.0.1/orangehrm-2.6/index.php");//open url
	    Thread.sleep(2000);
	    driver.findElement(By.name("txtUserName")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    //mouse over
	    
	    
	WebElement element = driver.findElement(By.linkText("PIM"));
	 
	    
	    
	    
	    Actions action=new Actions(driver);
	    
	    action.moveToElement(element/*driver.findElement(By.linkText("PIM"));*/).perform();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Add Employee")).click();
	    
	    driver.findElement(By.linkText("Logout")).click();
	    
	    Thread.sleep(3000);
	    
	    System.out.println("logout completed");
	    
	    driver.close();
	    
		}

	}



