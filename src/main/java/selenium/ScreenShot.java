package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.facebook.com");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("E:\\workspace.png"));
		
		
	}

}
