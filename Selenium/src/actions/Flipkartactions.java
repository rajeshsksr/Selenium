/**
 * 
 */
package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusableClass.ReusableClass;

public class Flipkartactions {

	public static void main(String[] args) throws InterruptedException {
		ReusableClass obj=new ReusableClass();

		WebDriver driver=obj.browserLaunch();
		
		obj.geturl("https://www.flipkart.com");
		
		obj.maximizeWindow();
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		driver.manage().window().maximize();
		
		WebElement closebtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebtn.click();
		
		WebElement btnmore=driver.findElement(By.xpath("//div[text()='More']"));
		
//		Actions actionobj=new Actions(driver);
//		actionobj.moveToElement(btnmore).perform();
		obj.mouseHover(btnmore);
//		obj.threadmethod(2000);
		
		WebElement notifyaction=driver.findElement(By.partialLinkText("Advertise"));
		notifyaction.click();
	}
} 
