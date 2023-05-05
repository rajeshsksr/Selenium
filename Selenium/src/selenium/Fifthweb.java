/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifthweb {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);

WebElement txt=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String text = txt.getText();
System.out.println(text);
	}

}
