package com.selenium;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class log4j {
	public WebDriver driver;
	Logger log=Logger.getLogger(log4j.class);
	
	
	
	@Test
	public void Launch()
	{   
		ChromeOptions op= new ChromeOptions();
		op.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		 driver= new ChromeDriver(op);
		 log.info("Launching======Browser!!");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		log.info("Launching Application");
	}
	
	@Test
	public void getTitle()
	{
		ChromeOptions op= new ChromeOptions();
		op.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver= new ChromeDriver(op);
		 log.info("Launching======Browser!!");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		log.info("Open Application");
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
		log.info("close browser!!!");
	}

}
