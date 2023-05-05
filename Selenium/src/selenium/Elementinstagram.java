package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementinstagram {
	public static void main(String []args) {

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();

	WebElement unElement=driver.findElement(By.name("username"));
	unElement.sendKeys("Ram@gmail.com");


	WebElement passElement=driver.findElement(By.name("password"));
	passElement.sendKeys("abc@123");


	WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.click();

}
}
