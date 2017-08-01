package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo
{
  public ActionsDemo() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("https://www.amazon.com/");
    

    driver.manage().window().maximize();
    


    Actions a = new Actions(driver);
    

    org.openqa.selenium.WebElement move = driver.findElement(By.id("nav-link-accountList"));
    




    a.moveToElement(move).build().perform();
    





    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(org.openqa.selenium.Keys.SHIFT).sendKeys(new CharSequence[] { "hello" }).doubleClick().build().perform();
    

    a.moveToElement(move).contextClick().build().perform();
  }
}
