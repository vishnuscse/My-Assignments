package week2.homeassigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//2. Enter UserName Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		//2. Enter Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//6. Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LTIMindtree");
		
		//8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu");
		
		//9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vardhan");
		
		//10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vishnu");
		
		//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA-Testing");
		
		//12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating a Lead User for Vishnu Vardhan");
		
		//10. Select value as Employee in Source Using SelectbyVisible text
		WebElement selSrc = driver.findElement(By.xpath("//span[text()='Source']/following::select[@id='createLeadForm_dataSourceId']"));
		Select sec2 = new Select(selSrc);
		sec2.selectByVisibleText("Employee");
		
		//11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement selMkt = driver.findElement(By.xpath("//span[text()='Marketing Campaign']/following::select[@id='createLeadForm_marketingCampaignId']"));
		Select sec3 = new Select(selMkt);
		sec3.selectByValue("9001");
		
		//13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement selOwn = driver.findElement(By.xpath("//span[text()='Ownership']/following::select[@id='createLeadForm_ownershipEnumId']"));
		Select sec4 = new Select(selOwn);
		sec4.selectByIndex(5);
		
		
		//Enter Area Code:
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("1");
		
		//Enter Phone Number:
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9952082566");
		
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishnu69154@abc.com");
		
		//14. Select State/Province as NewYork Using Visible Text
		//Step 1.Identify whether the dropdown is inside a select tag & Locate the dropdown element within the select tag and assign it to a variable
		WebElement selState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		//Step 2.Instantiate a class called Select  and pass the WebElement
		Select sec = new Select(selState);
		
		//Step 3. Select any drop down option by Using Visible Text
		sec.selectByVisibleText("New York");
		
		//15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
		

	}

}
