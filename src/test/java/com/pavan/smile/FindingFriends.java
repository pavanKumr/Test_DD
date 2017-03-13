package com.pavan.smile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindingFriends extends FacebookOpenPage {

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

		WebElement SearchButtonElm = driver.findElement(By.className("_1frb"));
		SearchButtonElm.click();

		Thread.sleep(1000);

		WebElement Searching = driver.findElement(By.className("_1frb"));
		Searching.sendKeys("Mallikarjuna Koduru");

		Thread.sleep(1000);

		WebElement SearchingClick = driver.findElement(By.cssSelector("._42ft._4jy0._4w98._4jy3._517h._51sy"));
		SearchingClick.click();
		Thread.sleep(5000);

		// _5d-5
		WebElement clicking = driver.findElement(By.className("_5d-5"));
		clicking.click();
		Thread.sleep(2000);

		WebElement Message = driver.findElement(By.className("coverBorder"));
		Message.click();
		Thread.sleep(5000);

		//_3j7l _2p78 _9--"
		
		WebElement closeButton = driver.findElement(By.xpath(".//*[@id='photos_snowlift']/div[2]/div/a/i"));
		closeButton.click();
		Thread.sleep(5000);

	}
}
