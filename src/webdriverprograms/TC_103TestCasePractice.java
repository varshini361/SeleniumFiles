package webdriverprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_103TestCasePractice {
	
	public static  String un="admin";
	public static String pw="admin123";
	
	
	
  public static void main(String args[]) throws Exception {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();//open browser
	 
	 driver.get("http://127.0.0.1/orangehrm-2.6/index.php");//open URL
	 
	 Thread.sleep(3000);
	 
	 if(driver.getTitle().equals("http://127.0.0.1/orangehrm-2.6/index.php")){
		 
		 System.out.println("title matched");
		 
		 
		 
	 }else {
		 
		 System.out.println("title not matched" + driver.getTitle());
	 }
	 
	 driver.findElement(By.name("txtUserName")).sendKeys(un);
	 
	 driver.findElement(By.name("txtPassword")).sendKeys(pw);
	 
	 driver.findElement(By.xpath("//input[@name='Submit']")).click();
	 
	  if(driver.getTitle().equals("http://127.0.0.1/orangehrm-2.6/index.php")) {
		  
		  
		  System.out.println("title matched");
		  
	  }else {
		  
		  System.out.println("tile not matched" + driver.getTitle());
	  }
	  
	  WebElement element=driver.findElement(By.linkText("Admin"));
	  
	  Actions action=new Actions(driver);
	  
	  action.moveToElement(element).perform();
	  
	  Thread.sleep(3000);
      
	  
	  WebElement element1=driver.findElement(By.linkText("Data Import/Export"));
	  
	  action.moveToElement(element1).perform();
	  
	  Thread.sleep(3000);
      
	  
	  driver.findElement(By.linkText("Export")).click();
	  
	  
	       Thread.sleep(3000);
	       
	       driver.findElement(By.linkText("Logout")).click();
	       
	       Thread.sleep(3000);
	       
	       
	       driver.close();
	  
	  
	  
	  
	 
	 
	 
	 
  }

}
