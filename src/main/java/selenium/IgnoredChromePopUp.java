package selenium;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IgnoredChromePopUp {
	@Test
	public void TestChrome()throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//disable-popup-blocking
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation")	);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/V4/");
		 Thread.sleep(2000);
		 driver.close();
		
	}

}
