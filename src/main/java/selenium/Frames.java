package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//http://www.popuptest.com/goodpopups.html
public class Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		int frames=driver.findElements(By.xpath("//iframe")).size();
		System.out.println(frames);
		
		
		
	}

}
