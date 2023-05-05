/**
 * 
 */
package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone",Keys.ENTER);
		
		WebElement selectphone =driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		selectphone.click();
		
		String pwid =driver.getWindowHandle();
		System.out.println("1st window id :"+pwid);
		Thread.sleep(1000);
						
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("Two windows id :"+allwindows); 
		
		for(String windowid:allwindows)
		{
			if(pwid != windowid  )
			{
				driver.switchTo().window(windowid);
			}
		}
		
		WebElement addtocart =driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		Thread.sleep(5000);
		driver.close();
		
		Thread.sleep(1000);
		driver.switchTo().window(pwid);
		
		selectphone.click(); 
	}

}
