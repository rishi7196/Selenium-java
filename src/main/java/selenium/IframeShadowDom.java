package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeShadowDom {
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		JavascriptExecutor jss= (JavascriptExecutor)driver;
		
		driver.switchTo().frame("pact");
		WebElement frame= (WebElement) jss.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		String js= "arguments[0].setAttribute('value','green tea')";
		jss.executeScript(js, frame);
		Thread.sleep(2000);
		driver.quit();
			
			
	}

}
