package webdriverprograms;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC_107Frames12 {
	
	public static void main(String args[]) throws Exception {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.drver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		Thread.sleep(4000);
		
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		
		
		System.out.println("Title matched");
	}
	
	else{
		
		System.out.println("Title not Matched and title is" +driver.getTitle());
		
		
	}
	
	assertTrue(driver.findElement(By.className("bodyTXT")).getText().matches("Login Name :"));
	
	System.out.println("Login name label matched");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.name("Submit")).click();
	
	System.out.println("login completed");
	
	if(driver.getTitle().equals("OrangeHRM")) {
		
		System.out.println("Title matched");
	}
	else{
		
		System.out.println("Title not Matched and Title is" + driver.getTitle());
	}
	
	driver.switchTo().frame("rightMenu");
	
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
	
	System.out.println("enter add");
	
	String empid=driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).getAttribute("value");
	
	System.out.println(empid);
	////*[@id="txtEmpLastName"]
	driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("selenium");
	
	driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("suresh");
	
	System.out.println("ok");
	

	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//*[@id=\"txtEmpFirstName\"]")).sendKeys("suresh");
	
	
 driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();

       Thread.sleep(2000);
	
	System.out.println("new empid added");
	
	driver.switchTo().defaultContent();
	
	 Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
	
	driver.close();
	
	
	
	}

}
