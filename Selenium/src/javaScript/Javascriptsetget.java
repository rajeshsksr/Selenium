/**
 * 
 */
package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptsetget {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		WebElement emailElement=driver.findElement(By.id("email"));
		
		WebElement passElement=driver.findElement(By.id("pass"));
		
		jse.executeScript("arguments[0].setAttribute('value','hello123@gmail.com')", emailElement);
		
		jse.executeScript("arguments[0].setAttribute('value','abc@321')", passElement);
		
		String username=(String) jse.executeScript("return arguments[0].getAttribute('value')", emailElement);
		System.out.println("Username-"+username);
		
		String password=(String) jse.executeScript("return arguments[0].getAttribute('value')", passElement);
		System.out.println("Password-"+password);
				
		WebElement loginButton=driver.findElement(By.name("login"));
		jse.executeScript("arguments[0].click()", loginButton);
		
		Thread.sleep(3000);
		driver.close();
	}

}
