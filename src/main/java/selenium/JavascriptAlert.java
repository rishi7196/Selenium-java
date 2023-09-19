package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	System.out.println("pass");
	
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(5000);
	String alert=driver.switchTo().alert().getText();
	System.out.println(alert);
	driver.switchTo().alert().accept();
	
	
	
	}

}
