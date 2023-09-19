package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ShadowDom {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement fname=(WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
		fname.sendKeys("Rishi kumar");
		
		

	}

}
