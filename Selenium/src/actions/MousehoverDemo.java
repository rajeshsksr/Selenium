package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusableClass.ReusableClass;

public class MousehoverDemo {

	public static void main(String[] args) throws InterruptedException {
		ReusableClass obj=new ReusableClass();

		WebDriver driver=obj.browserLaunch();
		
		obj.geturl("https://www.ebay.com/");
		
		obj.maximizeWindow();
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
		
		WebElement mousehover=driver.findElement(By.linkText("Electronics"));
		Thread.sleep(2000);
		
		Actions actionobj=new Actions(driver);
		
		actionobj.moveToElement(mousehover).perform();
		
//		WebElement clickelement=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
//		actionobj.moveToElement(clickelement).perform();
//		clickelement.click();
		Thread.sleep(2000);
		
		WebElement printtext=driver.findElement(By.xpath("(//h4[text()='Most popular categories'])[1]"));
//		String text=printtext.getText();
		System.out.println("The text is:"+obj.text(printtext));
		
	}
}
