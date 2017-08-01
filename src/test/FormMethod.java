package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormMethod
{
  public FormMethod() {}
  
  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("https://www.makemytrip.com/");
    














    junit.framework.Assert.assertFalse(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
    
















    Thread.sleep(3000L);
    driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[5]/a")).click();
  }
}
