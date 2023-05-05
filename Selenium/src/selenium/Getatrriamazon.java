/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getatrriamazon {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement emailElement=driver.findElement(By.xpath("//span[text()='Returns']"));
		emailElement.click();
			
		WebElement loginButton=driver.findElement(By.id("ap_email"));
		loginButton.sendKeys("Ram@gmail.com");
		
	//	String username=emailElement.getAttribute("value");
	//	System.out.println("value2-"+username);
		
		String userpass=loginButton.getAttribute("value");
		System.out.println("pass1-"+userpass);

		WebElement Button=driver.findElement(By.id("continue"));
		String button=Button.getText();
		System.out.println("pass2-"+button);
		WebElement Button1=driver.findElement(By.id("continue"));
		Button1.click();

	}

}
