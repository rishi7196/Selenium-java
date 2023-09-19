package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	//url:-file:///D:/all_lecture/selenium_source%20code/Ciber_implement/sample.html
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///D:/all_lecture/selenium_source%20code/Ciber_implement/sample.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("brow")).sendKeys("C:\\Users\\Rishu\\Desktop\\sikuli\\resume_sec"
				+ "\\1.6yr java +selenium\\1yt tesing.coc");
		
		
	}

}
