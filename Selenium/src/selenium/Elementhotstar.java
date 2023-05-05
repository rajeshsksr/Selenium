package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class Elementhotstar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com");
		driver.manage().window().maximize();
		
	//	WebElement login=driver.findElement(By.xpath("//button[text()='Subscribe']"));
	//	login.click();
		
		WebElement email=driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[1]/div/div[2]/div/div[5]/div"));
		email.click();
	//	login.sendKeys("Hello@gmail.com");
		

	//	WebElement button=driver.findElement(By.xpath("//"));
	//	button.click();		
	}

}
