package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorOne{
  
	public static void main(String[] args){
	    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");

	    // syntax: tagName[@attribute='value']
	    // must be unique to avoid duplicate names
	    // xpath : using attributes and its values
	    driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("qaclickacademy@gmail.com");
	    // xpath : customize
	    driver.findElement(By.xpath("//div[@id='prefooter']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input")).sendKeys("qaclickacademy@gmail.com");

	    // by attribute id
	    driver.findElement(By.id("user_email")).sendKeys("qaclickacademy@gmail.com");
	    
	    // by class name
	    driver.findElement(By.className("input-hg")).sendKeys("qaclickacademy@gmail.com");
	    
	    // by attribute name
	    // to click on a button
	    driver.findElement(By.name("commit")).click();
	    
	    // by link text
	    // pass the text of the link into the argument
	    // to re-allocate to another page
	    driver.findElement(By.linkText("Forgot Password?")).click();
	    
	    // by partial link text
	    // when text of the link changes frequently
	    // to re-allocate to another page
	    driver.findElement(By.partialLinkText("Forgot")).click();
	    
	    // by css selector
	    // 10 times faster than xpath (time efficient)
	    // using css selector to identify class parent node to class child node
	    // syntax : tagName[attribute='value']
	    driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("qaclickacademy@gmail.com");
	    // attribute id
	    driver.findElement(By.cssSelector("#user_email")).sendKeys("qaclickacademy@gmail.com");
	    driver.findElement(By.cssSelector("input[name='commit']")).click();
	    // class name
	    // must be unique, avoid duplicate class name
	    driver.findElement(By.cssSelector(".btn.btn-primary.btn-md.login-button")).click();
	
	}
	
}
