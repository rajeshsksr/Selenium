/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattrifacebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("hello@gmail.com");
		
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("abc123");
		
		String username=email.getAttribute("value");
		System.out.println("Email ID-"+username);
		
		String userpass=password.getAttribute("value");
		System.out.println("Password-"+userpass);

		WebElement login=driver.findElement(By.name("login"));		
		Thread.sleep(3000);		
		String button=login.getText();
		System.out.println("Button-"+button);
		login.click();
		
//		WebElement buttonlogin=driver.findElement(By.name("login"));
//		buttonlogin.click();
		
	}

}
