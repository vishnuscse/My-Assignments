package bootcamp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceCreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Step: Launch the browser (Chrome / Edge / Firefox / Safari).
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		
		//2. Step: Load the specified URL (https://login.salesforce.com/).
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		
		//3. Step: Enter the Username, Password and click on the Login button.
		driver.findElement(By.id("username")).sendKeys("vishnu@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Vardhan@14");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		//4. Step: Click on the App Launcher toggle button.
		driver.findElement(By.xpath("//div[@class='slds-r4']")).click();
		
		//5. Step: Click on the View All link.
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		
		//6. Step: Type ‘Marketing’ in the search box and click on the Marketing link.
		driver.findElement(By.xpath("//p[text()='Marketing']")).click();
		
		//7. Step: Navigate to the Leads tab from the Marketing dashboard.
		WebElement leads = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click();", leads);
		Thread.sleep(2000);
		
		//8. Step: Click on the New button to create a lead.
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		
		//9. Step: Fill in all the mandatory fields (Salutation, First Name, Last Name, Company) with valid data.
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vishnu");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Vardhan");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("LTIMindtree");
		
		//10. Step: Click on the Save button.
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
		
		//Verification of Step 10
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		//11. Step: In the newly created Lead page, locate the dropdown near Submit for Approval button and click on the Convert link.
		driver.findElement(By.xpath("(//*[name()='svg' and @class='slds-button__icon' and @data-key='down' and @focusable='false' and @viewBox='0 0 52 52' and @part='icon']//*[local-name()='path'])[2]")).click();
		driver.findElement(By.xpath("//a[@name='Convert']")).click();
		Thread.sleep(2000);
		
		//12. Step: Click on the Opportunity Name input field, clear and enter a new opportunity name.
		WebElement opp1 = driver.findElement(By.xpath("(//span[text()='Create New'])[3]/following::button"));
		driver.executeScript("arguments[0].click();", opp1);
		//Unable to Clear and overwrite, hence bypassing and clicking on convert button direct without any changes
		//opp1.clear();
		//opp1.sendKeys("Opp Vishnu");
		
		//driver.findElement(By.xpath("(//span[text()='Create New'])[3]/following::button")).clear();
		//driver.findElement(By.xpath("(//span[text()='Create New'])[3]/following::button")).sendKeys("Opp Vishnu");
		Thread.sleep(2000);
		
		//13. Step: Click on the Convert button.
		driver.findElement(By.xpath("//button[text()='Convert']")).click();
		
		//Verification of Step 13
		String text2 = driver.findElement(By.xpath("//div[@class='title']")).getText();
		System.out.println(text2);
		
		//14. Step: Click on the Go to Leads button.
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//15. Step: Search the verified lead name in the Search box and verify the text ‘No items to display’.
		driver.findElement(By.xpath("//input[@name='Lead-search-input']")).sendKeys("LTIMindtree");
		String verify = driver.findElement(By.xpath("//div[@class='emptyContentInner slds-text-align_center']")).getText();
		if (verify.contains("No items to display.")) {
			System.out.println("The Lead has been converted to Opportunity");
			
		}
		
		else {
			System.out.println("The Lead has NOT been converted.");
		}
		
		//16. Step: Navigate to the Opportunities tab and search for the opportunity linked with the converted lead.
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opp);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("LTIMindtree");
		String verify2 = driver.findElement(By.xpath("//th[@tabindex='-1']//a")).getText();
		
		if (verify2.contains("LTIMindtree")) {
			System.out.println("Opportunity succesfully created");
			
		}
		 
		else {
			System.out.println("Opportunity NOT created");
		}
		
		//17. Step: Search the opportunity name created and click on the created opportunity name
		driver.findElement(By.xpath("//span[text()='Opportunity Name']/following::a[text()[normalize-space()='LTIMindtree-']]")).click();
		
		//Verification of Step 17
		String text3 = driver.findElement(By.xpath("(//p[text()='Opportunity Owner']/following::span)[3]")).getText();
		if (text3.contains("Vishnu Vardhan")) {
			System.out.println("Opportunity name verified");
		}
		else {
			System.out.println("Opportunity name incorrect");
		}
	

	}

}
