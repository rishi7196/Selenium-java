package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


////http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html
public class DragAnddROP {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//put url
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='block-1']/h1"));
		WebElement target=driver.findElement(By.xpath("//div[@id='block-3']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source, target).perform();
	}
}