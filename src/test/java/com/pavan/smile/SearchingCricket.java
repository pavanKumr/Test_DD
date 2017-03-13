package com.pavan.smile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchingCricket extends FacebookOpenPage {
	
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
	  
	  WebElement SearchButtonElm = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div[1]/div/div/div/div[1]/div[2]/div/form/button"));
		SearchButtonElm.click();

		// validation
		Thread.sleep(1000);

		WebElement Searching = driver.findElement(By.className("_1frb"));
		Searching.sendKeys("Indian cricket team");

		Thread.sleep(1000);

		WebElement SearchingClick = driver.findElement(By.cssSelector("._42ft._4jy0._4w98._4jy3._517h._51sy"));
		SearchingClick.click();
		Thread.sleep(5000);

		WebElement watchingVideo = driver.findElement(By.className("_5d-5"));
		watchingVideo.click();
		Thread.sleep(2000);
  }
}
