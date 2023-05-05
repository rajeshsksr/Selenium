/**
 * 
 */
package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemoqa1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement clickbutton=driver.findElement(By.id("alertButton"));
		clickbutton.click();
		
		Alert objref=driver.switchTo().alert();
		Thread.sleep(3000);
		
		String name=objref.getText();
		System.out.println(name);	
		objref.dismiss();
	}

}
