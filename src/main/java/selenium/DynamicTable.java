package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("file:///E:/html_dom/table.html");
		
		//step firts print all row present in table 
		
		int row=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println(row);
		int coloum=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println(coloum);
		
		//Step 2 i want get data from specific row 
		//creating for loop for itertate each row and colum we need to create 
		
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]"))
						.getText()+ " ");
						}
			System.out.println();
		}
		
		
		
	}

}
