package reusableClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookWebElementReuse extends ReusableClass {
	
	FacebookWebElementReuse(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(name="email")
//	private static WebElement emailsignin;
//	
//	@FindBy(name="pass")
//	private static WebElement passsignin;	
	
	public static WebElement email;
	public static WebElement pass;
	@FindBy(name="login")
	private static WebElement loginsignin;

//	public static WebElement getEmailsignin() {
//		return emailsignin;
//	}
//	
//	public static WebElement getPasssignin() {
//		return passsignin;
//	}
	
	public static WebElement getLoginsignin() {
		return loginsignin;
	}
}