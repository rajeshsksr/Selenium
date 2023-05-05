/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
//		WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
	//	bestsellers.click();
		
		WebElement customerservicebutton=driver.findElement(By.partialLinkText("Customer"));
		customerservicebutton.click();
		
	}

}

