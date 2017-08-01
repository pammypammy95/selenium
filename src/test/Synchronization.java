package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization{
	
	public static void main(String[] args) throws InterruptedException{
		
	    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
    
	    driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
	    
	    
	    // implicit wait
	    // wait for 5 seconds
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    // send keys
	    driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
	    
	    // to press TAB in a webpage
	    // use 'Keys.TAB'
	    driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
	   
	    // to press ENTER in a webpage
	    // use 'Keys.ENTER'
	    driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
	    
	    // declare explicit wait
	    // driver to wait for 20 seconds
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    // wait until the specific conddition occurs or happened
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'Jamaica-Hotels-Radisson-Hotel-JFK-Airport')]")));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='151294']/div[2]/div/a")));
	    
	    // when the weblink is too long
	    // use contains() to find weblink that contains specific words
	    // synchronization problem
	    // it fails because loading is not completed from the previous page
	    // therefore, declare implicit/explicit wait at the top of the java class
	    driver.findElement(By.xpath("//a[contains(@href,'Jamaica-Hotels-Radisson-Hotel-JFK-Airport')]")).click();
		
	}
	
}
