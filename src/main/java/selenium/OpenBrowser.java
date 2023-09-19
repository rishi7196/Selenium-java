package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		
		 String st=driver.getTitle();
		 {
			 System.out.println(st);
		 }
		//driver.findElement(By.id("username")).sendKeys("admin");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='admin'");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	}
}