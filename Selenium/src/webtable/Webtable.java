/**
 * 
 */
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//	    driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		
		int leng=allrows.size();
		
//		System.out.println("Total rows :"+leng);
//		System.out.println("1st row :"+allrows.get(1).getText());
//		System.out.println("Last row :"+allrows.get(leng-1).getText());
		
		System.out.println("Middle row :"+allrows.get(leng/2).getText());
		
//		WebElement scdrow =allrows.get(2);
//		System.out.println("2nd row :"+scdrow.getText());
		
//		List<WebElement> mex=scdrow.findElements(By.tagName("td"));
//		System.out.println("2nd row 3rd column :"+mex.get(1).getText());
//		
//		for(WebElement w:mex)
//		{
//			String text=w.getText();
//			System.out.println("Text:"+text);
//		}
		
	}
}
