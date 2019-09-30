package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_109Dropdown {
	
	public static void main(String args[])throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/SELENIUM%20Software/HtmlFiles/dropdownNavigate.html");
		
		System.out.println("title is" + driver.getTitle());
		
	Select sel=new Select(driver.findElement(By.name("OptWeb")));//single drop down
	
	sel.selectByVisibleText("Google");
	
	System.out.println("enterd google page");
	
	driver.findElement(By.name("btnGo")).click();//click go button
	
	driver.navigate().back();
	
	Thread.sleep(4000);
	
	driver.get("file:///C:/SELENIUM%20Software/HtmlFiles/multiselectdropdown.html");
	
	Select sel1=new Select(driver.findElement(By.id("tools")));
	
	sel1.selectByVisibleText("Selenium IDE");
	Thread.sleep(2000);
	sel1.selectByIndex(1);
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	
	
	
		
		
		
	}

}
