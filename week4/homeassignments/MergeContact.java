package week4.day2.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//* 8. Click on First Resulting Contact
		//Move to Window Handling:
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		//to get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		//to switch to a particular index
		List<String> handles = new ArrayList<>(windowHandles);
		//switch to the particular  From Contact window using index
		driver.switchTo().window(handles.get(1));
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		////td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext']
		
		//Click on First Resulting Contact
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[1]")).click();
		
		
		//Navigating to Main Window
		driver.switchTo().window(handles.get(0));
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
			//10. Click on Second Resulting Contact
			//Move to Window Handling:
				String windowHandle1 = driver.getWindowHandle();
				System.out.println(windowHandle1);
				
				//to get all window handles
				Set<String> windowHandles1 = driver.getWindowHandles();
				
				//to switch to a particular index
				List<String> handles1 = new ArrayList<>(windowHandles1);
				//switch to the particular  From Contact window using index
				driver.switchTo().window(handles1.get(1));
				
				String title3 = driver.getTitle();
				System.out.println(title3);
				
				//Click on First Resulting Contact
				driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[2]")).click();
				
				
				//Navigating to Main Window
				driver.switchTo().window(handles1.get(0));
				
				//11. Click on Merge button using Xpath Locator
				driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
				
			//12. Accept the Alert
				//switch the control to the alert
				Alert alert = driver.switchTo().alert();
				//read the alert message/text
				String text = alert.getText();
				System.out.println("Alert Message: " +text);
				
				//click OK
				alert.accept();
				
			//13. Verify the title of the page
				String title4 = driver.getTitle();
				System.out.println(title4);
			
			
			
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
