/**
 * 
 */
package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		DateTimeFormatter time =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now =LocalDateTime.now();
		System.out.println(time.format(now));
		
		WebElement emailElement=driver.findElement(By.id("email"));
		emailElement.sendKeys("Hello123@gmail.com");


		WebElement passElement=driver.findElement(By.id("pass"));
		passElement.sendKeys("abc@123");
						
		TakesScreenshot scrshot=(TakesScreenshot) driver;
		File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
		System.out.println("SrcFile:"+srcFile);
		
		String mylocation="D:\\rajesh-workspace\\Selenium\\Images\\facebook"+timestamp()+".png";	
		File destFile=new File(mylocation);
		FileUtils.copyFile(srcFile, destFile);
	
	}

public static String timestamp() {
		return new SimpleDateFormat("ddMMyyyy HHmmss").format(new Date());
	
	}		

}
