package scenerioBased;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLowestPrice {
	
	public static void main(String[] args) {      
      
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com/Apple-iPhone-13-Pro-Max/dp/B09J6K121Q");

        // Find the element that contains the price of the iPhone.
        WebElement priceElement = driver.findElement(By.id("priceblock_ourprice"));
        // Get the text of the element.
        String priceText = priceElement.getText();
        // Convert the text to a numeric value.
        float price = Float.parseFloat(priceText);

        // Find the lowest price among all the prices.
        float lowestPrice = price;

        // Iterate through all the prices.
        for (WebElement priceElement1 : driver.findElements(By.cssSelector(".a-price"))) {
            // Get the text of the element.
            String priceText1 = priceElement.getText();

            // Convert the text to a numeric value.
            float price1 = Float.parseFloat(priceText1);

            // If the price is lower than the lowest price, update the lowest price.
            if (price < lowestPrice) {
                lowestPrice = price;
            }
        }

        // Print the lowest price.
        System.out.println("The lowest price of iPhone is " + lowestPrice);
    }
}


