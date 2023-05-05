package reusableClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWebElementReuse extends ReusableClass {
	
	public AmazonWebElementReuse() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-orders")
	private WebElement returnelement;
	
	@FindBy(id="ap_email")
	private WebElement emailsignin;	
	
	@FindBy(id="continue")
	private WebElement loginsignin;

	public WebElement getReturnelement() {
		return returnelement;
	}

	public WebElement getEmailsignin() {
		return emailsignin;
	}
	
	public WebElement getLoginsignin() {
		return loginsignin;
	}
}
