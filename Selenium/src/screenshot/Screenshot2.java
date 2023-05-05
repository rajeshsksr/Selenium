/**
 * 
 */
package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Date currentdate=new Date();
		System.out.println(currentdate);
		
		String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		TakesScreenshot ts=(TakesScreenshot) driver;		
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("D:\\rajesh-workspace\\Selenium\\\\Images\\facebooklogin"+screenshotfilename+".png"));
	}

}
					