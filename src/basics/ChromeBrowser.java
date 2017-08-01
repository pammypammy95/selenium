package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser{
  
	public static void main(String[] args){
	    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    	
	    /*
	     * navigate to url
	     * pass the particular website name
	     * to load a webpage
	     */
	    driver.get("http://qaclickacademy.com");
	
	}
}
