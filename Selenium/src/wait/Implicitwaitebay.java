/**
 * 
 */
package wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Implicitwaitebay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[5]/a"));
		
		Actions obj =new Actions(driver);
		obj.moveToElement(element).perform();
		
		Wait<WebDriver>mouseover=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Hello selenium")
				.ignoring(NoSuchElementException.class);
				
	//	WebDriverWait mouseover=new WebDriverWait(driver, Duration.ofSeconds(7));
	//	mouseover.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Accessoriesss for men"))).click();
		
	}
}
