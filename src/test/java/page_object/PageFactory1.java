package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory1 {
	@FindBy(id="ap_email")
	public static WebElement emailid;
	@FindBy(id="continue")
	public static WebElement loginid;
	 
}
