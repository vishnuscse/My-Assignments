package week2.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		//01) Launch the Url  https://www.pvrcinemas.com/
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		
		//02) Click  on Movie Library
		driver.findElement(By.xpath("(//i[@class='icon-bar icon'])[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		//03) Select the City -->chennai
		Thread.sleep(10000);
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select sec = new Select(city);
		sec.selectByVisibleText("Chennai");
		
		//04) Select the Genre-->Animation
		Thread.sleep(10000);
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select sec1 = new Select(genre);
		sec1.selectByVisibleText("ANIMATION");
		
		//05) Select the Language-->english
		Thread.sleep(5000);
		WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));
		Select sec2 = new Select(lang);
		sec2.selectByVisibleText("ENGLISH");
		
		//06) Click on Apply
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		
		//07) Click on first resulting animation movie
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']")).click();
		
		//08) Click proceed to book
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//09) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		
		//Cinema
		Thread.sleep(5000);
		WebElement cinema = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select sec3 = new Select(cinema);
		sec3.selectByValue("PVR Theyagaraja Thiruvanmiyur Chennai");
		
		//Date
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-valid')])[3]")).click();
		driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
	
		
		//Show Time
		Thread.sleep(5000);
		WebElement showTime = driver.findElement(By.xpath("//select[@name='timings']"));
		Select sec4 = new Select(showTime);
		sec4.selectByVisibleText("03:00 PM - 06:00 PM");
		
		//Seats
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
		
		//Name
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vishnu");
		
		//Email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishnuscse@gmail.com");
		
		//Mobile
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9952082566");
		
		//F&B Requirement
		Thread.sleep(5000);
		WebElement fnb = driver.findElement(By.xpath("//select[@name='food']"));
		Select sec5 = new Select(fnb);
		sec5.selectByVisibleText("Yes");
		
		////Other Requirement
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Not Applicable");
		
		//10) Click on copy to self 
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		//11) Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		//12) Click cancel
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		//13) Close the OTP dialog
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		
		//14) Verify the title of the page
		System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
