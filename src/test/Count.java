package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users/Pamela.Koh/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com.sg/");
		
		// count the number of links in the entire webpage
		// link have to be define in <a>
		// for multiple tagnames (<a>), use findElements()
		System.out.print("Number of link in a page: ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// count the number of links in the footer section
		// within the footer scope
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.print("Number of link in the footer section: ");
		// filter
		System.out.println(footer.findElements(By.tagName("a")).size());
	}

}
