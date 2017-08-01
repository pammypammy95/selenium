package test;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class ChildWindowHandling
{
  public ChildWindowHandling() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
    


    driver.findElement(org.openqa.selenium.By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
    System.out.println("Before switching: ");
    


    System.out.println(driver.getTitle());
    






    Set<String> ids = driver.getWindowHandles();
    


    System.out.println("After switiching:");
    Iterator<String> it = ids.iterator();
    String parentid = (String)it.next();
    String childid = (String)it.next();
    



    driver.switchTo().window(childid);
    
    System.out.println(driver.getTitle());
    
    System.out.println("Back to parent window: ");
    
    driver.switchTo().window(parentid);
    System.out.println(driver.getTitle());
  }
}
