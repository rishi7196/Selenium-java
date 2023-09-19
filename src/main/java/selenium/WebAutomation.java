package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://Users//joyghosh//Desktop//BDD.Cucumber//Experiment//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.game.tv");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		List <WebElement> Gamescount = driver.findElements(By.xpath("//li[@class='games-item']"));
		
		for(int i = 0 ; i < Gamescount.size() ; i++)
		{
			// JavascriptExecutor js = (JavascriptExecutor) driver;
	       // js.executeScript("arguments[0].scrollIntoView(true);",GameNames.get(i));
			List <WebElement> GameNames = driver.findElements(By.xpath("//li[@class='games-item']//figcaption"));
			List <WebElement> GameUrls = driver.findElements(By.xpath("//li[@class='games-item']/a"));
			List <WebElement> Games = driver.findElements(By.xpath("//li[@class='games-item']"));
			System.out.print(GameNames.get(i).getText().toString());
			System.out.print("     "); 
			System.out.print("https://www.game.tv/"+GameUrls.get(i).getAttribute("href").toString());
			System.out.print("     "); 
			Games.get(i).click();
			System.out.print(driver.findElement(By.xpath("//span[@class='count-tournaments']")).getText().toString());
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("     ");
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//	System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");		
//	WebDriver driver= new ChromeDriver();
//	
//	//defirne wait 
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
//	driver.get("https://www.game.tv/");
//	
//	List<WebElement> Gamename = driver.findElements(By.xpath("//li[@class='games-item']/a/figcaption"));
//	 System.out.println(Gamename.size());
//	 for(WebElement webElement : Gamename)
//	 {
//		 String names=webElement.getText();
//		 
//		 System.out.println(names);
//	 }
//	 List<WebElement> elemets = driver.findElements(By.xpath("//li[@class='games-item']/a"));
//	 System.out.println(elemets.size());
//	 {
//		 for(WebElement webelement : elemets)
//		 {
//			 String text=webelement.getAttribute("href");
//			 System.out.println(text);
//		 }
//		 List <WebElement> Elements = driver.findElements(By.xpath("//li[@class='games-item']/a/figure/img"));
//		 int count =Elements.size();
//		 for(int k= 1;  k<= count ; k++)
//		 {
//			 Elements.get(k).click();
//			 
//			 System.out.println(driver.findElement(By.xpath("//span[@class='count-tournaments']")).getText().toString());
//			 driver.get("https://www.game.tv/");
//			 Thread.sleep(5000);
//		 }
//	 }
//	}
//}
//		