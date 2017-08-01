package test;

import org.openqa.selenium.WebDriver;

public class CheckBox
{
  public CheckBox() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("http://spicejet.com/");
  }
}
