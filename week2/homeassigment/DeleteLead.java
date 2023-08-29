package week2.homeassigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		//* 1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//* 2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		//* 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//* 4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//* 5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//* 6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//* 7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//9	Enter phone number
		//Area Code
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		
		//Phone Number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9952082566");
		
		//10	Click find leads button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//11	Capture lead ID of First Resulting lead
		Thread.sleep(2000);
		System.out.println("The Title of the Resulting Page is:  " + driver.getTitle());
		String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The Deleted Lead ID is: " +LeadID);
		
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(LeadID);
		
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		String Delete = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (Delete.contains("No records to display")){
			System.out.println("Succesfully Deleted");
		}
			else {
				System.out.println("NOT Succesfully Deleted");
			
			}
		
		//18	Close the browser (Do not log out)
		driver.close();
		}
		
	
	
	}
