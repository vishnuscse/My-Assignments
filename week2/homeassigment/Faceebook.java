package week2.homeassigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Faceebook {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vishnu");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vardhan");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9952082566");
		
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9952082566");
		
		
		// Step 11: Handle all the three drop downs
		//Selecting Date
		WebElement selDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sec = new Select(selDate);
		sec.selectByValue("14");
		
		//Selecting Month
		WebElement selMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sec1 = new Select(selMonth);
		sec1.selectByVisibleText("Dec");
		
		//Selecting Year
		WebElement selYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sec2 = new Select(selYear);
		sec2.selectByVisibleText("1991");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
	}

}
