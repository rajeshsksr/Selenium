/**
 * 
 */
package webtable;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTask {

		private static final String String = null;

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		String actualtext="Alfreds Futterkiste Maria Anders Germany";
		int leng=allrows.size();
		
//		System.out.println("1st row :"+allrows.get(1).getText());
//		System.out.println("2nd row :"+allrows.get(2).getText());
//		System.out.println("3rd row :"+allrows.get(3).getText());
//		System.out.println("4th row :"+allrows.get(leng-3).getText());
//		System.out.println("5th row :"+allrows.get(leng-2).getText());
//		System.out.println("Last row :"+allrows.get(leng-1).getText());
		
//		WebElement text=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]"));
//		String randomtext=text.getText();
//		System.out.println("Randomtext :"+randomtext);
//		String firstrow=allrows.get(1).getText();
//		System.out.println(firstrow);
		
//		if(firstrow.contains(actualtext))
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
	}

}
