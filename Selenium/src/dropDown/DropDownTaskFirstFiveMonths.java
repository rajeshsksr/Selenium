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

public class DropDownTaskFirstFiveMonths {

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
		
		List<WebElement> list=selectobj.getOptions();
		
		for(int i=selectobj.getOptions().size()-12;i<selectobj.getOptions().size()-7;i++)
		{
			WebElement index=list.get(i);			
			String indexvalue=index.getText();
			System.out.println((i+1)+"--"+indexvalue);
		}

	}

}
