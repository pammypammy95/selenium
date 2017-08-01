package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame{
  
  	public static void main(String[] args){
	    
  		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://jqueryui.com/droppable/");
	    
	    // switch to frame
	    // pass web element as argument
	    // able to perform operation in the frame
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	    
	    // to drag and down the object
	    // Actions class is used
	    Actions a = new Actions(driver);
	    
	    // declare web element
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	    // pass web element into the argument
	    a.dragAndDrop(source, target).build().perform();
	    
	    // to perform operation outside the iframe
	    // switch back
	    driver.switchTo().defaultContent();
	    
  	}
  	
}
