package webdriverprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;

public class TC_105Frames {
	
	public static void main(String args[]) throws Exception {
		
		
		System.setProperty("webdriver.chrome.drver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//open browser
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");//open URL
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("login compl");
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome admin"));
		
		System.out.println("Title matched");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("rightMenu");//frames
		
		driver.findElement(By.xpath("//*[@id=\\\"standardView\\\"]/div[3]/div[1]/input[1]")).click();
		
		Thread.sleep(3000);
		
		
		String epmid=driver.findElement(By.xpath("")).getAttribute("value");
		
		
		
		System.out.println(epmid);
		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("anitha");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("cheekuri");
		
		driver.findElement(By.id("btnEdit")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
