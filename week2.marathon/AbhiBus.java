package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		//01) Launch  Chrome/Edge/Firefox/Safari browser 
		//02) Load https://www.abhibus.com/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//03) Click on Bus
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		
		//04) Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		
		//05) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//06) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		//07) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//08) Select tomorrow s date in the Date field
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[text()='31']")).click();
		
		//09) Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		//09) Print the name of the first resulting bus (use .getText())
		String Bus = driver.findElement(By.xpath("(//div[@class='search-column1']/h2)[1]")).getText();
		System.out.println("The First Resulting Bus is: " +Bus);
		
		//10) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		
		//11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		String Bus1 = driver.findElement(By.xpath("(//div[@class='search-column1']/h2)[1]")).getText();
		System.out.println("The First Resulting Sleeper Bus is: " +Bus1);
		
		//Seats Available DIsplay
		String Seats = driver.findElement(By.xpath("(//div[@class='search-column2-col1']/p)[1]")).getText();
		System.out.println("The First Resulting Sleeper Bus Vacancy is: " +Seats);
		
		//12) Click SelectSeat
		driver.findElement(By.xpath("(//div[@class='col2']//span[@class='book'])[1]")).click();
		
		//13) Choose any one Available seat
		driver.findElement(By.xpath("//a[@id='UO4-3ZZ']")).click();
		
		//14) Print Seats Selected ,Total Fare
		String SeatNo = driver.findElement(By.xpath("//p[@class='right']/span[@id='seatnos']")).getText();
		System.out.println("The Selected Seat Number is: " +SeatNo);
		
		String fare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("The Total Fare is: Rs." +fare);
		
		//15) Select Boarding Point  and Dropping Point (Select class)
		Thread.sleep(2000);
		WebElement BrdPt = driver.findElement(By.id("boardingpoint_id"));
		Select sec = new Select(BrdPt);
		sec.selectByVisibleText("Ekkatutthangal-23:06");
		
		WebElement DrpPt = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select sec1 = new Select(DrpPt);
		sec1.selectByVisibleText("Bayapanahalli Metro Station-06:19");
		
		//16) Get the Title of the page(use .getTitle())
		System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
		
		//17) Close the browser (driver.close())
		driver.close();
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
