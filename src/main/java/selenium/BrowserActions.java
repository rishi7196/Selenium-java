 package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	String title=driver.getTitle();
	System.out.println(title);
	String source=driver.getPageSource();
	System.out.println(source);
	}

}


