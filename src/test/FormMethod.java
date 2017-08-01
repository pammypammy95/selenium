package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethod{
  
	public static void main(String[] args) throws InterruptedException{
	   
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.makemytrip.com/");
	    
	    
	    // check if ui element is displayed and visible in the webpage
	    // check the visibility of ui element
	    System.out.print("Before clicking on multicity button: ");
	    // used when the ui element is in the HTML code but not visible
	    // exception thrown if ui element is removed from code
	    System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	    
	    driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
	    
	    System.out.print("After clicking on multicity button: ");
	    System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	    
	    // to check if the ui element is removed or available in the html code
	    int count = driver.findElements(By.xpath("//label[@for='switch__input_3']")).size();
	    
	    if(count == 0){
	    	System.out.println("Verified");
	    }
	    
	    // to check whether if the ui element is in enable mode
	    System.out.println(driver.findElement(By.xpath("//label[@for='switch__input_3']")).isEnabled());
	    
	    // get the text from a particular location in the HTML code
	    System.out.println(driver.findElement(By.xpath("//div[@class='fd_heading clearfix']/h2")).getText());
	    
	    // automation continue if it return true
	    // automation stops if it return false
	    // assertTrue() always expect to be true
	    Assert.assertTrue(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	    // assertFalse() always expect to be false
	    Assert.assertFalse(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
	    
	    // to select the calendar
	    driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
	    driver.findElement(By.xpath("//input[@id='hp-widget_depart']")).click();
	    // unable to click immediately, let it sleep for 3 seconds
	    Thread.sleep(3000L);
	    driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[5]/a")).click();
  }
}
