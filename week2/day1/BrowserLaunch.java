package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("https://open.spotify.com/");
		
		//Maximise the Window
		driver.manage().window().maximize();
		
		//Get the Website Title
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		//closing the browser
		driver.close();
		
		
		
		
		

	}

}
