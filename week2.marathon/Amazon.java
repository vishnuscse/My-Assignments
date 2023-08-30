package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//01) Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//03) Type "Bags" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		//04) Choose the      item in the result (bags for boys)
		driver.findElement(By.xpath("(//div[@class='left-pane-results-container']/div)[8]")).click();
		
		//05) Print the total number of results (like 50000)
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(""+text);
		
		//06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		//07) Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		//08) Print the first resulting bag info (name, discounted price)
		String bagName = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']")).getText();
		System.out.println("The Resulted Bag Name is: " +bagName);
		
		String bagCost = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Resulted Bag Name is: Rs." +bagCost);
		
		//09) Get the page title and close the browser(driver.close())
		System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
		driver.close();

	}

}
