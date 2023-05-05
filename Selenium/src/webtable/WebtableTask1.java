/**
 * 
 */
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTask1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		
		int leng=allrows.size();
		
		for(int i=1;i<=leng;i=i+2)
		{
		System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]")).getText()+ " ");
		System.out.println();
		}
		}
	
}
