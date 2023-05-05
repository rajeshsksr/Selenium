/**
 * 
 */
package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com");
		driver.manage().window().maximize();
		
		WebElement btncourse=driver.findElement(By.linkText("COURSES"));
		
		Actions actionobj=new Actions(driver);
		
		actionobj.moveToElement(btncourse).perform();
		
		WebElement btnorac=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		actionobj.moveToElement(btnorac).perform();
		
		WebElement plsqlaction=driver.findElement(By.xpath("//span[text()='PLSQL Certification']"));
		plsqlaction.click();
	}

}
