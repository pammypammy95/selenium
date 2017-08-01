package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization
{
  public Synchronization() {}
  
  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
    


    driver.manage().timeouts().implicitlyWait(5L, java.util.concurrent.TimeUnit.SECONDS);
    

    driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(new CharSequence[] { "nyc" });
    


    driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(new CharSequence[] { Keys.TAB });
    


    driver.findElement(By.id("H-fromDate")).sendKeys(new CharSequence[] { Keys.ENTER });
    


    WebDriverWait wait = new WebDriverWait(driver, 20L);
    

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'Jamaica-Hotels-Radisson-Hotel-JFK-Airport')]")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='151294']/div[2]/div/a")));
    





    driver.findElement(By.xpath("//a[contains(@href,'Jamaica-Hotels-Radisson-Hotel-JFK-Airport')]")).click();
  }
}
