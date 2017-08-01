package test;

import org.openqa.selenium.WebDriver;

public class RadioButton
{
  public RadioButton() {}
  
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    
    driver.get("http://echoecho.com/htmlforms10.htm");
    


    driver.findElement(org.openqa.selenium.By.xpath("//input[@value='Butter']")).click();
    

    System.out.println(driver.findElements(org.openqa.selenium.By.xpath("//input[@name='group1']")).size());
    int count = driver.findElements(org.openqa.selenium.By.xpath("//input[@name='group1']")).size();
    



    for (int i = 0; i < count; i++)
    {
      String text = ((org.openqa.selenium.WebElement)driver.findElements(org.openqa.selenium.By.xpath("//input[@name='group1']")).get(i)).getAttribute("value");
      
      if (text.equals("Cheese")) {
        ((org.openqa.selenium.WebElement)driver.findElements(org.openqa.selenium.By.xpath("//input[@name='group1']")).get(i)).click();
      }
    }
  }
}
