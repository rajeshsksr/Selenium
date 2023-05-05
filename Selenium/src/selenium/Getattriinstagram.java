/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattriinstagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.name("username"));
		email.sendKeys("hellogamil.com");
		
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("abc123");
		
		String username=email.getAttribute("value");
		System.out.println("value2-"+username);
		
		String userpass=password.getAttribute("value");
		System.out.println("pass1-"+userpass);

		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		String button=loginButton.getText();
		System.out.println("pass2-"+button);
		
		loginButton.click();

	}

}
