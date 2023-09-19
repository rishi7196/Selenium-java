package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementSelenium {
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("document.getElementById('displayed-text').value='rishikumar'");
		
		
		
	}

}
