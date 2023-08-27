package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInteraction {

	public static void main(String[] args) throws InterruptedException {
				
				//Launch Browser
				ChromeDriver driver = new ChromeDriver();
				
				//Enter the URL
				driver.get("https://login.salesforce.com/");
				
				//Maximise the Window
				driver.manage().window().maximize();
				
				//Get the Website Title
				String title = driver.getTitle();
				System.out.println(title);

				//Capturing Login Field and Entering the value:
				driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
				
				//Capturing Password Field and Entering the value:
				driver.findElement(By.id("password")).sendKeys("Leaf$1234");
				
				//CLicking on Login Button:
				driver.findElement(By.id("Login")).click();
				
				Thread.sleep(2000);
				//closing the browser
				driver.close();
	}

}
