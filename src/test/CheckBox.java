package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox{

	public static void main(String[] args){
    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
		driver.get("http://spicejet.com/");
		
		// to validate if the check box is selected
	    System.out.println(driver.findElement(By.id("ct100_mainContent_chk_IndArm")).isSelected());
	    // select check box from webpage
	    driver.findElement(By.id("ct100_mainContent_chk_IndArm")).click();
	    driver.findElement(By.cssSelector("#ct100_mainContent_chk_IndArm")).click();
	    // check if it is already selected
	    System.out.println(driver.findElement(By.id("ct100_mainContent_chk_IndArm")).isSelected());
  }
}
