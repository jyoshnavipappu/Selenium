package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script {
	static WebDriver driver;


	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium software\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	}

	@When("Enter mobile number and password")
	public void enter_mobile_number_and_password() {
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	}
	@Then("click on login")
	public void click_on_login() 
	{
		String str = driver.getCurrentUrl();

		Assert.assertEquals(str.equalsIgnoreCase("https://www.amazon.in/ap/signin"), false);
	}

}
