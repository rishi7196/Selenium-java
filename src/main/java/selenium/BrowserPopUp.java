package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {
	
	//http://www.popuptest.com/goodpopups.html
	// first we will get both windows id 
	// now we will switch child and control back to main windows
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver .get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[@href=\"http://www.popuptest.com/popup2.html\"]")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		String parentWindowId=it.next();
		System.out.println("Parent window id is :"+parentWindowId);
		
		String childWindowsId=it.next();
		System.out.println("Child windows id is "+childWindowsId);
		Thread.sleep(2000);
		
		driver.switchTo().window(childWindowsId);
		System.out.println("child windows title is::::::: "+driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent windows title is ::::::"+driver.getTitle());
		
		driver.close();
		
		
		
	}

}
