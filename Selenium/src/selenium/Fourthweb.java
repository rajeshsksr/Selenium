/**
 * 
 */
package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourthweb {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
	
	}

}
