package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOnePlusCart {

	public static void main(String[] args) throws InterruptedException {
	
		//01) Launch Chrome and Load https://www.amazon.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		//3.Get the price of the first product
		
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Price of the First Product in Seach Page is: " +price);
		//Coverting the price to int
		String pricewocomma = price.replaceAll(",", "");
		int int1 = Integer.parseInt(pricewocomma);
		System.out.println("The Price of the First Product in Seach Page in Integer Format is: " +int1);
		
		//4. Print the number of customer ratings for the first displayed product
		//String ratings = driver.findElement(By.xpath("//span[text()='4.3']")).getText();
		//float float1 = Integer.parseInt(ratings);
		//System.out.println("The Customer Ratings of the First Product in Search Page is: " +float1);
		
		//5. Click the first text link of the first image
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//Post this --> Action needs to be done on Another WebPage
		Set<String> windowHandles = driver.getWindowHandles();
		//Navigating to Another Tab/New Tab to further execute
		List<String> handles = new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		//6. Take a screen shot of the product displayed
		//driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scr, new File(path));
		
		//7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(7000);
		String pricecart = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("The Price of the First Product in Cart Page is: " +pricecart);
		
		//converting pricecart to int
		String replace4 =pricecart.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println("The Price of the First Product in Cart Page in Integer Format is: " +replace4);
		String replaceAll = replace4.replaceAll("0", "");		
		int int2 = Integer.parseInt(replaceAll);
		//Verify if its correct
		if (int1==int2) {
			System.out.println("Both the prices are correct");
			
		}
		else {
			System.out.println("Both the prices are different");
		}
		
		

	}

}
