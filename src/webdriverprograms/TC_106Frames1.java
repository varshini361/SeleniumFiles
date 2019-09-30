package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.testng.Assert.assertTrue;

public class TC_106Frames1 {

public static void main(String args[]) throws Exception {
		
		
		System.setProperty("webdriver.chrome.drver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//open browser
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");//open URL
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("login completed");
		
		Thread.sleep(3000);
		
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText().matches("Welcome admin"));
		
		System.out.println("Title Matched");
		
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
		
		System.out.println("enter add");
		
		String empid=driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).getAttribute("value");
		
		System.out.println(empid);
		////*[@id="txtEmpLastName"]
		driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("suresh");
		
		System.out.println("enterd detailes");
		
		WebElement fileInput=driver.findElement(By.name("photofile"));
		
		fileInput.sendKeys("");
		

		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"txtEmpFirstName\"]")).sendKeys("suresh");
		
		
		
		
		
		
		
		
		
		
		
           driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	
           Thread.sleep(2000);
		
		System.out.println("new empid added");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
		
		driver.close();
		
		
		
		
		
		
		
}
}
