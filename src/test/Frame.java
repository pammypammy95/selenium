package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame
{
  public Frame() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("http://jqueryui.com/droppable/");
    








    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
    


    Actions a = new Actions(driver);
    
    org.openqa.selenium.WebElement source = driver.findElement(By.id("draggable"));
    org.openqa.selenium.WebElement target = driver.findElement(By.id("droppable"));
    
    a.dragAndDrop(source, target).build().perform();
    


    driver.switchTo().defaultContent();
  }
}
