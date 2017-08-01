package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown{
  
	public static void main(String[] args){
	    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://spicejet.com/");
	    
	    // select drop-down from webpage
	    // by passing attribute name and value
	    Select s = new Select(driver.findElement(By.id("ct100_mainContent_dd1_Adult")));
	    // select the option by value of the text
	    s.selectByValue("2");
	    // select by index
	    // 0-based index
	    s.selectByIndex(6);
	    // select by visible text
	    s.selectByVisibleText("5 Adults");
	
	    // select dynamic drop-down from webpage
	    // by passing attribute name and value
	    driver.findElement(By.cssSelector("#ct100_mainContent_dd1_originStation1_CTXT")).click();
	    // select the option by passing xpath
	    driver.findElement(By.xpath("//a[@value='GOI']")).click();
	    // problem occurs when there is common code written for arrtibute's value
	    // identify source code from left to right, top to bottom 
	    driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	
	}
	
}
