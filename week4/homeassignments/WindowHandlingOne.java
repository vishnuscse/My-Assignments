package week4.day2.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingOne {

	public static void main(String[] args) {
				// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://leafground.com/window.xhtml;jsessionid=node0rcrt0y0w8es915iipcnnx44u3478956.node0");
				
				//Maximize the Window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Capturing the main page Title
				String title = driver.getTitle();
				System.out.println(title);
				
				//Find the Element
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				
				//
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);
				
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				
				List<String> handles = new ArrayList<>(windowHandles);
				//switch to the particular  From Contact window using index
				driver.switchTo().window(handles.get(1));
				
				//Capturing the New Window Title
				String title2 = driver.getTitle();
				System.out.println(title2);
				
				if (title2.contains("Dashboard")) {
					System.out.println("New Window Opened Succesfully");
					
				}
				else {
					System.out.println("New Window NOT Opened Succesfully");
				}
				
				

	}

}
