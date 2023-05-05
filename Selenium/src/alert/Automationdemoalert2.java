/**
 * 
 */
package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationdemoalert2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement alertbutton=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertbutton.click();
		
		WebElement clickbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickbutton.click();
		
		Alert a=driver.switchTo().alert();
		String name=a.getText();
		System.out.println(name);
		a.accept();
		
		WebElement confirmmsg=driver.findElement(By.id("demo"));
		String msg=confirmmsg.getText();
		System.out.println(msg);	

	}

}
