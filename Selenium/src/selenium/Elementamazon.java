package selenium;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import reusableClass.ReusableClass;
import reusableClass.AmazonWebElementReuse;
public class Elementamazon {

	public static void main(String[] args) {
		
		ReusableClass obj=new ReusableClass();
		
		WebDriver driver=obj.browserLaunch();
		
		obj.geturl("https://www.amazon.in");
		
		obj.maximizeWindow();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in");
//		driver.manage().window().maximize();

		AmazonWebElementReuse reuseloc=new AmazonWebElementReuse();
		
	//	WebElement emailElement=driver.findElement(By.xpath("//span[text()='Returns']"));
	//	emailElement.click();
		PageFactory.initElements(driver, reuseloc);
		WebElement returnelement=reuseloc.getReturnelement();
		obj.click(returnelement);
		
	//	WebElement loginButton=driver.findElement(By.id("ap_email"));
	//	loginButton.sendKeys("HelloGmail.com");
		WebElement loginButton=reuseloc.getEmailsignin();
		obj.sendkeysToElement(loginButton, "name@gmail.com");

	//	WebElement Button=driver.findElement(By.id("continue"));
	//	Button.click();
		WebElement Button=reuseloc.getLoginsignin();
		obj.click(Button);
	}
}

