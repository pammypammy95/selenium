package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton{

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		// radio button
		// by xpath
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
    
		// number of radio buttons present in the same attribute value
		// use findElements with an 's'
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
    
		// select the specified radio button
		// without any value provided, only common attribute value
		// 0-based index
	    for (int i = 0; i < count; i++){
	    	
	    	String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	      
	    	if (text.equals("Cheese")) {
	    		driver.findElements(org.openqa.selenium.By.xpath("//input[@name='group1']")).get(i).click();
	    	}
	    	
	    }
	    
	}
	
}
