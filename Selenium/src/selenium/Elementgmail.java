package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementgmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();

		WebElement emailElement=driver.findElement(By.id("identifierId"));
		emailElement.sendKeys("Hello123@gmail.com");


		WebElement NextButton=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
		NextButton.click();

		

	}

}
