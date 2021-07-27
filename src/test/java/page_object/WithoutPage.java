package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutPage {
	public static WebElement textBox(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//input[@type=\"email\"]"));
	}
	public static WebElement clickButton(WebDriver driver) 
	{
		return driver.findElement(By.id("continue"));
	}

}
