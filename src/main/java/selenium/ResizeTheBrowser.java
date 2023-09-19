package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeTheBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		Dimension d= new Dimension(400, 300);
		driver.manage().window().setSize(d);
		
		
		
	}

}
