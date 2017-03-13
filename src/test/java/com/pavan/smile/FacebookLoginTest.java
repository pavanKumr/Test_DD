package com.pavan.smile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pavanyamini45@gmail.com");
		Thread.sleep(1000);

		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("powerstar244");
		Thread.sleep(1000);

		WebElement signIn = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		signIn.click();
		Thread.sleep(1000);
  }
}
