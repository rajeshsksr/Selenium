package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusableClass.ReusableClass;

public class Contextclick {

	public static void main(String[] args) throws InterruptedException {
		ReusableClass obj=new ReusableClass();

		WebDriver driver=obj.browserLaunch();
		
		obj.geturl("https://www.google.com");
		
		obj.maximizeWindow();
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
		
		WebElement btngmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
	//	Actions acc=new Actions(driver);
	//	acc.contextClick(btngmail).perform();
		
		obj.contextClick(btngmail);
		
		obj.threadmethod(2000);
		obj.closeBrowser();
	}

}
