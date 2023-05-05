/**
 * 
 */
package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement frameelement =driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frameelement);
		
		
		WebElement imageelement=driver.findElement(By.xpath("/html/body/a/img"));
		imageelement.click();
//		
//		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		
//		WebElement emailelement=driver.findElement(By.id("philadelphia-field-email"));
//		emailelement.sendKeys("hai123@gmail.com");
//		
//		List<WebElement> frameset=driver.findElements(By.tagName("iframe"));
//		int leng=frameset.size();
//		System.out.println(leng);
		
		
	}

}
