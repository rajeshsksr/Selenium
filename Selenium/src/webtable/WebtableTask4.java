/**
 * 
 */
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTask4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		List<WebElement> allcolumns=table.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));

		int leng=allrows.size();
		int colleng=allcolumns.size();
		System.out.println("Total rows :"+leng);
		System.out.println("Tot no of columns :"+colleng);
		
//		for(int i=2;i<=leng;i=i+2)
//		{
//		for(int j=3;j<=colleng;j++)
//		{
//		System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i +"]/td[" + j +"]")).getText()+ " ");
//		}
//		System.out.println();
//		}
		
		
		for(int i=2;i<=leng;i=i+2)
		{
		for(int j=1;j<=colleng;j++)
		{
		System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i +"]/td[" + j +"]")).getText()+ " ");
		}
		System.out.println();
		}
	}

}
