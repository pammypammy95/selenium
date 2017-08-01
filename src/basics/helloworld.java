package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld{
  
	public static void main(String[] args){
    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
		driver.get("http://qaclickacademy.com");
		
		// get title of webpage
		System.out.println(driver.getTitle());
		// get page source
		System.out.println(driver.getPageSource());
		// get the current url that is being navigated to as a string
		// security purpose - verification
		System.out.println(driver.getCurrentUrl());
		
		// to close the browser
		driver.close();
	
	}
	
}
