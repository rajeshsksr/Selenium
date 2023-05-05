package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusableClass.ReusableClass;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		ReusableClass obj=new ReusableClass();

		WebDriver driver=obj.browserLaunch();
		
		obj.geturl("https://jqueryui.com/droppable/");
		
		obj.maximizeWindow();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
		
//		WebElement iframe=driver.findElement(By.cssSelector("iframe.demo-frame"));
//		driver.switchTo().frame(iframe);
//		obj.frame(iframe);
		
//		Actions acc=new Actions(driver);

//		WebElement drag=driver.findElement(By.id("draggable"));
//		WebElement drop=driver.findElement(By.id("droppable"));
//		
//		acc.dragAndDrop(drag, drop).perform();
//		obj.dragAndDrop(drag, drop);
		WebElement scrollelement=driver.findElement(By.linkText("Widget Factory"));
//		acc.scrollToElement(scrollelement).perform();
		obj.threadmethod(2000);
		obj.scroll(scrollelement);
	}

}
