package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DynamicTable1 {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/");
		
		//find now of row
		List<WebElement> NoOfRow=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		
		for(WebElement wb:NoOfRow)
		{
			String Rows =wb.getText();
			System.out.println(Rows);
			
			boolean status=false;
			if(Rows.contains("Sachin"))
			{
				status=true;
				break;
			}
		
		Assert.assertTrue(true ,"+Schin is found");
		}
		List <WebElement>row1=driver.findElements(By.xpath("//*[@id='customers']//tr/td[4]"));
		for(WebElement w:row1)
		{
			String st =w.getText();
			if(st.equalsIgnoreCase("USA"))
			{
				System.out.println(st);
			}
		}
	}
	


}
