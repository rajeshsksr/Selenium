/**
 * 
 */
package javaScript;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptscroll {

	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		
//		String script ="return document.title;";
//		String title =(String) jse.executeScript(script);
//		System.out.println(title);
//		
//		WebElement idElement=driver.findElement(By.id("glow-ingress-line1"));
//		String textofid=(String) jse.executeScript("return arguments[0].getText()", idElement);
//		System.out.println("Text-"+textofid);
		
//		WebElement hellotext =driver.findElement(By.id("glow-ingress-line1"));
//		jse.executeScript("arguments[0].style.border='5px solid blue'", hellotext);
		
		WebElement signinbutton=driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div"));
//		jse.executeScript("arguments[0].scrollIntoView(true);", signinbutton);
		jse.executeScript("arguments[0].click();", signinbutton);
		
//		TakesScreenshot scrshot=(TakesScreenshot) driver;
//		File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
//		System.out.println("SrcFile:"+srcFile);
//		
//		String mylocation="D:\\rajesh-workspace\\Selenium\\Images\\amazonscroll"+timestamp()+".png";	
//		File destFile=new File(mylocation);
//		FileUtils.copyFile(srcFile, destFile);
		
		
	}

//public static String timestamp() {
//		return new SimpleDateFormat("ddMMyyyy HHmmss").format(new Date());
//	
//	}		
	
		
}
