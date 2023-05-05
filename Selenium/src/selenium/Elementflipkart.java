package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementflipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		WebElement emailElement=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailElement.sendKeys("jar@gmail.com");


		WebElement passElement=driver.findElement(By.xpath("//input[@type='password']"));
		passElement.sendKeys("abc@123");


		WebElement loginButton=driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		loginButton.click();

	
	}

}
