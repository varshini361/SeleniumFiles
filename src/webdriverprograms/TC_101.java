package webdriverprograms;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_101 {
	

	public static String un="admin";
	
	public static String pw="admin123";
	
	public static void main(String args[]) throws Exception {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		
		//test case steps
		
	obj.get("http://127.0.0.1/orangehrm-2.6/index.php");
	
	if(obj.getTitle().equals("http://127.0.0.1/orangehrm-2.6/index.php")) {
		
		System.out.println("title matched");
		
	}
	else {
		
		System.out.println("ttle is not matched and title is" + obj.getTitle());
	}
	 obj.findElement(By.name("txtUserName")).sendKeys(un);
	 
	 obj.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
	 
	 obj.findElement(By.name("Submit")).click();
	 
	 System.out.println("login complited");
	 
	 Thread.sleep(3000);
	 
	 obj.findElement(By.linkText("Logout")).click();
	 
	 System.out.println("logout complited");
	 
	 obj.close();
	
	
	
	
	
	
	
	}

}
