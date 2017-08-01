package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo{
  
	public static void main(String[] args){
		
	    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.com/");
	    
	    // to maximize the window
	    driver.manage().window().maximize();
	    
	    // to pass driver as object
	    // driver will have the actions class capability
	    Actions a = new Actions(driver);
	    
	    // mouse-over the ui element
	    // build() ready to be execute, but yet to be executed
	    // perform() perform the execution
	    //			 can be used to perform composite action
	    WebElement move = driver.findElement(By.id("nav-link-accountList"));
	    a.moveToElement(move).build().perform();
	    
	    // input as capital letter
	    // hold down SHIFT key and key in letters
	    // keyDown() act as the 'hold'
	    // doubleClick() to highlight the text
	    // concatenating all the action
	    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(org.openqa.selenium.Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
	}
	
}
