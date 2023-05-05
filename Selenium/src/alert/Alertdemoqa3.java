/**
 * 
 */
package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemoqa3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement clickbutton=driver.findElement(By.id("confirmButton"));
		clickbutton.click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
//		String name=a.getText();
//		System.out.println(name);
		a.dismiss();
		
//		WebElement confirmmsg=driver.findElement(By.id("confirmResult"));
//		String msg=confirmmsg.getText();
//		System.out.println(msg);
	}

}
