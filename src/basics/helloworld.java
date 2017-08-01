package basics;

import org.openqa.selenium.WebDriver;

public class helloworld
{
  public helloworld() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    



    driver.get("http://qaclickacademy.com");
    

    System.out.println(driver.getTitle());
    

    System.out.println(driver.getPageSource());
    


    System.out.println(driver.getCurrentUrl());
    

    driver.close();
  }
}
