package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorOne
{
  public LocatorOne() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
    











































    driver.findElement(org.openqa.selenium.By.cssSelector("input[id='user_email']")).sendKeys(new CharSequence[] { "qaclickacademy@gmail.com" });
    
    driver.findElement(org.openqa.selenium.By.cssSelector("#user_email")).sendKeys(new CharSequence[] { "qaclickacademy@gmail.com" });
    driver.findElement(org.openqa.selenium.By.cssSelector("input[name='commit']")).click();
    

    driver.findElement(org.openqa.selenium.By.cssSelector(".btn.btn-primary.btn-md.login-button")).click();
  }
}
