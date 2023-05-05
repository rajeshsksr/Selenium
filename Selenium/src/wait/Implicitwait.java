/**
 * 
 */

package wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		Actions obj =new Actions(driver);
		obj.moveToElement(element).perform();
		
		WebElement mouseover =driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span"));
		mouseover.click();
	}
}
