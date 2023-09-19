package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void excutesessionOne()
	{
		   //First session of WebDriver
             WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void excutesessiontwo()
	{
		   //First session of WebDriver
            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
	@Test	
	public void excutesessionthird()
	{
		   //First session of WebDriver
             WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/V4/");
	}
}