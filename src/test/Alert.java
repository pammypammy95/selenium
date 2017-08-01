package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert{

	public static void main(String[] args){
	    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	    
	    // to select the button
	    // java pop-up is then displayed
	    driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
	    // verify text displayed in java pop-up is as expected
	    System.out.println(driver.switchTo().alert().getText());
	    // switching web view to java pop-up view
	    // to select the java pop-up 'Ok' button
	    driver.switchTo().alert().accept();
	    // to select the java pop-up 'Cancel' button
	    driver.switchTo().alert().dismiss();
	    // to enter text into java pop-up
	    driver.switchTo().alert().sendKeys("");
	    
	}
	
}
