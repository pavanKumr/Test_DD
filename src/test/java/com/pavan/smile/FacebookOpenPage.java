package com.pavan.smile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class FacebookOpenPage {
	WebDriver driver = null;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) throws InterruptedException {
		System.out.println("Runnig in the Browser:" + browser);

		if (browser.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			throw new RuntimeException("Browser not support");
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();

	}

	// @Test
	// public void pavan() {
	// System.out.println("I opend the Facebook page");
	// }

	@AfterMethod

	public void tearDown() {
		driver.close();
	}
}
