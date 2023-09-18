	package bootcamp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceCreateDelectContact {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Step: Launch the browser (Chrome / Edge / Firefox / Safari).
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
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
		
		//6. Step: Navigate to the 'Accounts' tab from the Accounts dashboard.
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Accounts");
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		Thread.sleep(2000);
		
		//Account Creation -----------------
		
		//7. Step: Navigate to the Accounts tab from the Marketing dashboard.
		//8. Step: Click on the 'New' button to create a new account.
		WebElement new1 = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click();",new1);
		Thread.sleep(2000);
		
		//9. Step: Fill in all the mandatory fields (Account Name, Type) with valid data.
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Vishnu Vardhan");
		
		//10. Step: Click on the Save button.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
		
		
		//Contact Creation --------------
		//11. Step: In the newly created Account page, locate the 'Contacts' related list and click on the 'New Contact' button.
		driver.findElement(By.xpath("//button[@name='NewContact']")).click();
		
		//12. Step: Fill in all the mandatory fields (First Name, Last Name, Email) with valid data.
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vishnu");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Vardhan");
		
		//13. Step: Click on the 'Save' button.
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text1 = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		//Contact Deletion --------------
		//14. Step: Go back to the detailed view of the created Account.
		driver.findElement(By.xpath("//div[@class='slds-r4']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Accounts");
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		Thread.sleep(2000);
		
		//15. Step: Click on the 'Delete' button to delete the account.
		driver.findElement(By.xpath("//span[text()='Account Name']/following::a[contains(@class,'slds-truncate outputLookupLink')]")).click();
		Thread.sleep(2000);
		//WebElement deletesvg = driver.findElement(By.xpath("//*[name()='svg' and @class='slds-button__icon' and @data-key='down' and @focusable='false' and @part='icon']//*[local-name()='path']"));
		//driver.executeScript("arguments[0].click();", deletesvg);
		driver.findElement(By.xpath("//*[name()='svg' and @class='slds-button__icon' and @data-key='down' and @focusable='false' and @part='icon']//*[local-name()='path']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(2000);
		
		//16. Step: Confirm the deletion by clicking 'OK' in the confirmation dialog.
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
		String text2 = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text2);
		
		//17. Step: Navigate to the 'Contacts' tab
		WebElement contacts = driver.findElement(By.xpath("//span[text()='Contacts']"));
		driver.executeScript("arguments[0].click();", contacts);
		Thread.sleep(2000);
		
		//18. Step: Search for the deleted contact by First Name, Last Name, or Email.
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Vishnu" + "\n");
		String verify = driver.findElement(By.xpath("//div[@class='emptyContent slds-is-absolute']//span")).getText();
		
		if(verify.contains("No items to display.")) {
		
			System.out.println("Verified");
		}
		
		else {
			System.out.println("Not Verified");
		}
		
	}

}
