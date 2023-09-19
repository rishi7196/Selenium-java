package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		
		//defirne wait 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://traxsmart-erp-staging.firebaseapp.com/#/dashboard");
		//driver.findElement(By.name("username")).sendKeys("7596036541    ");
		//driver.findElement(By.name("password")).sendKeys("pas@12");
		//driver.findElement(By.className("Sign In")).click();
		//driver.findElement(By.xpath("//button[@class=\"btn btn-rose btn-lg col-md-9 login-btn\"]")).click();
		Thread.sleep(2000);
		
		
		List<WebElement>links=driver.findElements(By.tagName("//a"));
		//links.add(driver.findElement(By.tagName("img")));
		System.out.println("size of full,image and links =================="+links.size());
		
		//step 2// iterate the links ============= exclude al links  and image -------- doesmot have href attribute 
		
		List<WebElement>activeliks= new ArrayList<WebElement>();
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			if(links.get(i).getAttribute("href")!=null && (! links.get(i).getAttribute("href").contains("javascript"))) {
				
				activeliks.add(links.get(i));
			}
		}
		System.out.println("size of all active links ==========="+activeliks.size());
		
		//step 3 check the href url
		for(int j=0;j<activeliks.size();j++)
		{
              HttpURLConnection connection=(HttpURLConnection)  new URL(activeliks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeliks.get(j).getAttribute("href")+"============"+response);
		}
	}
	
}
