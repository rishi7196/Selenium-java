package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabSwitich {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentswin=driver.getWindowHandle();
		System.out.println(parentswin);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//open new tab
		
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		String childWind=driver.getWindowHandle();
		System.out.println(childWind);
		
		newTab.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hello");
		newTab.close();
		
		driver.switchTo().window(parentswin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
