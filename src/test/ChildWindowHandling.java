package test;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling{
  
	public static void main(String[] args){
	    
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
    
	    // click on the link
	    // a new tab window is open (Child window)
	    driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
	    System.out.print("Before switching: ");
	    // print the window title
	    // parent window title will be printed, but not child window
	    System.out.println(driver.getTitle());
	    
	    // to print the child window title
	    // get all windows' windowID opened by WebDriver and is available
	    // for multiple windows, use getWindowHandles(), it stores in set
	    // for a window, use getWindowHandle()
	    // by default, parent windowID will be stored first
	    // sequentially, the immediate child windowID will be stored
	    Set<String> ids = driver.getWindowHandles();
	    
	    // using iterator, you can iterate to the child/parent window
	    // start from the top, before parent window
	    System.out.println("After switiching:");
	    Iterator<String> it = ids.iterator();
	    String parentid = (String)it.next();
	    String childid = (String)it.next();
	    
	    // to switch to child window
	    // pass childID into the argument
	    // can perform operation on the child window
	    driver.switchTo().window(childid);
	    // print child title window
	    System.out.println(driver.getTitle());
	    
	    System.out.println("Back to parent window: ");
	    // to switch back to parent window
	    driver.switchTo().window(parentid);
	    System.out.println(driver.getTitle());
	
	}
	
}
