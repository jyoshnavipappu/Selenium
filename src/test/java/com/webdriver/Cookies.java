package com.webdriver;

import java.io.File;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	@Test(enabled=false)
	public void getCookies()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies"+ cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName() +":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getDomain());
		}
		
	}
	
	@Test(enabled=false)
	public void addCookies()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Cookie c1 = new Cookie("My Cookies", "123456");
		driver.manage().addCookie(c1);
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies"+ cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName() +":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getDomain());
		}
	}
		
		@Test(enabled=false)
		public void deleteCookies()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver;

			driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			Cookie c2 = new Cookie("My Cookies", "123456");
			driver.manage().deleteCookie(c2);
			
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("Size of cookies"+ cookies.size());
			for(Cookie cookie:cookies)
			{
				System.out.println(cookie.getName() +":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getDomain());
			}
	}
		@Test(enabled=false)
		public void deleteAllCookies()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver;

			driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			Cookie c2 = new Cookie("My Cookies", "123456");
			driver.manage().deleteAllCookies();
			
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("Size of cookies"+ cookies.size());
			for(Cookie cookie:cookies)
			{
				System.out.println(cookie.getName() +":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getDomain());
			}
		}
		@Test
		public void deleteNamedCookies()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver;

			driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("Size of cookies"+ cookies.size());
			System.out.println(driver.manage().getCookieNamed("session-id-time"));
			
		}
}
