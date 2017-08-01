package test;

import org.openqa.selenium.WebDriver;

public class Alert
{
  public Alert() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
    


    driver.findElement(org.openqa.selenium.By.xpath("//input[@value='Confirmation Alert']")).click();
    
    System.out.println(driver.switchTo().alert().getText());
    

    driver.switchTo().alert().accept();
    
    driver.switchTo().alert().dismiss();
    
    driver.switchTo().alert().sendKeys("");
  }
}
