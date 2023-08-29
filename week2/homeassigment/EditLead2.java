package week2.homeassigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

	public static void main(String[] args) throws InterruptedException {

		//* 1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
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
		
		//* 8	Enter first name
		//driver.findElement(By.name("firstName")).sendKeys("Vardhan");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vardhan");
		
		//* 9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		//* 10 Click on first resulting lead
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//* 11 Verify title of the page
		System.out.println("The Title of the Resulting Page is:  " + driver.getTitle());
		
		//* 12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//* 13 Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Attra Infotech Pvt Ltd");
		
		//* 14 Click Update
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//* 15 Confirm the changed name appears
		String CompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		//if (CompanyName == "Attra Infotech Pvt Ltd")
		if (CompanyName.contains("Attra Infotech Pvt Ltd")){
			System.out.println("Company Name is Updated Succesfully");
		}
			else {
				System.out.println("Company Name is NOT Updated Succesfully");
			
			}
		
		//* 16 Close the browser (Do not log out)
		driver.close();
		}
		
	
	
	}
