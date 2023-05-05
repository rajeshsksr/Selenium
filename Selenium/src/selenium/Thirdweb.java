package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdweb {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
	}

}
