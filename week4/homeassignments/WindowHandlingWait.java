package week4.day2.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingWait {

	public static void main(String[] args) {
				// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://leafground.com/window.xhtml;jsessionid=node0rcrt0y0w8es915iipcnnx44u3478956.node0");
				
				//Maximize the Window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Capturing the main page Title
				String title = driver.getTitle();
				System.out.println("Main Window Title:" +title);
				
				//Find the Element
				driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
				
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println("Below are the Window Handle ID's: ");
				System.out.println(windowHandles);
				
				List<String> handles = new ArrayList<>(windowHandles);
				
				int size = handles.size();
				System.out.println("Number of Tabs Opened: " +size);
				
				for (int i = handles.size()-1; i > 0; i--) {
					driver.switchTo().window(handles.get(i));
					String title2 = driver.getTitle();
					System.out.println("Current Window: " +title2);
					System.out.println("Closing the " + title2 + " and navigating to main window");
					driver.close();
					
				}
				
				driver.switchTo().window(handles.get(0));
				String title3 = driver.getTitle();
				System.out.println("Current Window: " +title3);
				
				

	}

}
