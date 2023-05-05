/**
 * 
 */
package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement signupbutton= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		signupbutton.click();
		Thread.sleep(2000);
		
		WebElement ddmonth=driver.findElement(By.id("month"));
		ddmonth.click();
		
		Select selectobj=new Select(ddmonth);
//		selectobj.selectByIndex(3);
//		Thread.sleep(2000);
//		
//		selectobj.selectByValue("10");
//		Thread.sleep(2000);
//		
//		selectobj.selectByVisibleText("Mar");
//		Thread.sleep(2000);
		
		List<WebElement> list=selectobj.getOptions();
//		System.out.println("Size:"+list.size());
//		
//		System.out.println("1st:"+list.get(0).getText());
//		System.out.println("Last:"+list.get(list.size()-1).getText());
		
//		WebElement firstindex=list.get(0);
//		String firstvalue=firstindex.getText();
//		System.out.println("Month Name:"+firstvalue);
//		
		int total=selectobj.getOptions().size()-1;
//		System.out.println("Total:"+total);
		
//		WebElement lastindex=list.get(total);
//		String lastvalue=lastindex.getText();
//		System.out.println("Month Name:"+lastvalue);
//		
//		int middle=(total/2);
//		WebElement middleindex=list.get(middle);
//		String middlevalue=middleindex.getText();
//		System.out.println("Middle value:"+middlevalue);
		
		for(int i=selectobj.getOptions().size()-5;i<selectobj.getOptions().size();i++)
		{
			WebElement index=list.get(i);
			String indexvalue=index.getAttribute("value");
			System.out.println(indexvalue);
//			String indexv=index.getText();
//			System.out.println((i+1)+"--"+indexv);
		}
		
	}

}
