package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		
		ExcelLibrary xlib= new ExcelLibrary();
		
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String us=xlib.getExcelData("login", 1, 0);
		driver.findElement(By.id("username")).sendKeys(us);
		System.out.println("Enter username");
		Thread.sleep(1000);
		String pw=xlib.getExcelData("login", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		System.out.println("enter password");
		
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login successfully ");
		
		driver.quit();
//		ExcelLibrary xlib= new ExcelLibrary();
//		String st=xlib.getExcelData("login", 1, 0);
//		System.out.println(st);
//		
//		String pw=xlib.getExcelData("login", 1, 1);
//		System.out.println(pw);
	}

}
