package week2.homeassigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
				
				//5. Click on Accounts Button
				driver.findElement(By.linkText("Accounts")).click();
				
				//6. Click on Create Account
				driver.findElement(By.linkText("Create Account")).click();
				
				//7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
				driver.findElement(By.xpath("//span[text()='Account Name']/following::input[@id='accountName']")).sendKeys("Debit Limited Account Vishnu");
				
				//8. Enter Descriptiion as "Selenium Automation Tester"
				driver.findElement(By.xpath("//span[text()='Description']/following::textarea[@name='description']")).sendKeys("Selenium Automation Tester");
				
				//9. Enter LocalName Field Using Xpath Locator
				driver.findElement(By.xpath("//span[text()='Local Name']/following::input[@id='groupNameLocal']")).sendKeys("LTIMindtree");
				
				//10. Enter SiteName Field Using Xpath Locator
				driver.findElement(By.xpath("//span[text()='Site Name']/following::input[@id='officeSiteName']")).sendKeys("Chennai");
				
				//11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
				driver.findElement(By.xpath("//span[@class='tableheadtext']/following::input[@id='annualRevenue']")).sendKeys("1000000");
				
				//12. Select Industry as ComputerSoftware
				WebElement selInd = driver.findElement(By.xpath("//span[text()='Industry']/following::select[@name='industryEnumId']"));
				Select sec = new Select(selInd);
				sec.selectByVisibleText("Computer Software");
				
				//13. Select OwnerShip as S-Corporation using SelectByVisibletext
				WebElement selOwn = driver.findElement(By.xpath("//span[text()='Ownership']/following::select[@name='ownershipEnumId']"));
				Select sec1 = new Select(selOwn);
				sec1.selectByVisibleText("S-Corporation");
				
				//14. Select Source as Employee using SelectByValue
				WebElement selSrc = driver.findElement(By.xpath("//span[text()='Source']/following::select[@id='dataSourceId']"));
				Select sec2 = new Select(selSrc);
				sec2.selectByValue("LEAD_EMPLOYEE");
				
				//15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
				WebElement selMkt = driver.findElement(By.xpath("//span[text()='Marketing Campaign']/following::select[@id='marketingCampaignId']"));
				Select sec3 = new Select(selMkt);
				sec3.selectByIndex(6);
				
				//16. Select State/Province as Texas using SelectByValue 
				WebElement selState = driver.findElement(By.xpath("//span[text()='State/Province']/following::select[@id='generalStateProvinceGeoId']"));
				Select sec4 = new Select(selState);
				sec4.selectByValue("TX");
				
				// 17. Click on Create Account using Xpath Locator
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				System.out.println("Account Created Succesfully");
				
				System.out.println("The Title of the Resulting Page is:" + driver.getTitle());
				
				
				

	}

}
