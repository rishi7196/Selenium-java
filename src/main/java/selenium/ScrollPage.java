package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// by using java script excutor
public class ScrollPage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.facebook.com");
		
		JavascriptExecutor excutor=(JavascriptExecutor)driver;
		
		//excutor.executeScript("window.scrollBy(0,250)", "");
		//Alternative we do page down 
		excutor.executeScript("scroll(0, 250);");
		//Page_Up
		Thread.sleep(2000);
		excutor.executeScript("scroll(0, -250);");
		
	}

}
