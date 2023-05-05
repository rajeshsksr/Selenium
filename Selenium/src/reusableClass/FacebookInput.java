package reusableClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FacebookInput extends ReusableClass {

	public static void main(String[] args) throws InterruptedException  {
		
		ReusableClass obj=new ReusableClass();
		
		obj.browserLaunch();
		
		obj.geturl("https://www.facebook.com");
		
		obj.maximizeWindow();
		
		System.out.println("Title:"+obj.gettitletext());
		
		FacebookWebElementReuse locator=new FacebookWebElementReuse(driver);
		
//		PageFactory.initElements(driver, locator);
//		obj.element2(locator.getEmailsignin(), "hello");
//		WebElement emailElement=locator.getEmailsignin();
//		obj.element2(emailElement, "hello");	
		obj.element2(FacebookWebElementReuse.email, "hello");
		obj.element2(FacebookWebElementReuse.pass, "password");
		
//		obj.element2(locator.getPasssignin(), "password");
//		WebElement passElement=locator.getPasssignin();
//		obj.sendkeysToElement(passElement, "password");
	
		WebElement loginButton=locator.getLoginsignin();
		obj.click(loginButton);
		
	}
}

//	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com");
//	driver.manage().window().maximize();

//WebElement emailElement=driver.findElement(By.id("email"));
//WebElement passElement=driver.findElement(By.id("pass"));
//WebElement loginButton=driver.findElement(By.name("login"));