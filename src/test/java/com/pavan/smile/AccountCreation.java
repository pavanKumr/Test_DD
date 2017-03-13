package com.pavan.smile;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class AccountCreation extends FacebookOpenPage {



	@Test
	public void f() throws InterruptedException {
		WebElement firstName = driver.findElement(By.id("u_0_1"));
		firstName.sendKeys("pavan");

		Thread.sleep(1000);

		WebElement surName = driver.findElement(By.id("u_0_3"));
		surName.sendKeys("satya");
		Thread.sleep(1000);

		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("pavanyamini45@gmail.com");
		Thread.sleep(1000);

		WebElement reenterEmailId = driver.findElement(By.id("u_0_9"));
		reenterEmailId.sendKeys("pavanyamini45@gmail.com");

		WebElement newPassword = driver.findElement(By.xpath(".//*[@id='u_0_b']"));
		newPassword.sendKeys("powerstar244");
		Thread.sleep(1000);
		// month day year

		Select dropdownMonth = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		dropdownMonth.selectByVisibleText("Feb");
		Thread.sleep(1000);

		Select dropdownDay = new Select(driver.findElement(By.id("day")));
		dropdownDay.selectByVisibleText("11");
		Thread.sleep(1000);

		Select dropdownYear = new Select(driver.findElement(By.id("year")));
		dropdownYear.selectByVisibleText("1993");
		Thread.sleep(1000);

		WebElement Gendar = driver.findElement(By.xpath(".//*[@id='u_0_j']"));
		Gendar.click();
		Thread.sleep(1000);

		WebElement submit = driver.findElement(By.xpath(".//*[@id='u_0_f']"));
		submit.click();
		Thread.sleep(1000);

		System.out.println("I Created Account");

	}

}
