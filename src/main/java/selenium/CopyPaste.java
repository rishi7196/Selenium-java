package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement ele2=	driver.findElement(By.xpath("//input[@name='password']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(ele1).click().sendKeys("Admin");
		//press ctrl a and ctrl c;p.6d d
		
		ac.keyDown(Keys.CONTROL).sendKeys("a");
		ac.sendKeys("c");
		//click inside text 2 click and CTRL + V
		ac.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
		ac.keyUp(Keys.CONTROL).build().perform();
	}

}
