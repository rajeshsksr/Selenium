/**
 * 
 */
package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:amazon.in");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//iframe[@id='ape_Gateway_right-2_desktop_iframe']")).click();
//		Thread.sleep(4000);
//		driver.switchTo().parentFrame();
//		
//		driver.switchTo().frame(2);
//		WebElement frame2=driver.findElement(By.xpath("iFrame will not show if you have adBlock extension enabled"));
//		
//		Thread.sleep(4000);
//		driver.switchTo().parentFrame();
		
		
		
	}

}
