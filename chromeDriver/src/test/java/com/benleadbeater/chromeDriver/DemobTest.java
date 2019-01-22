package com.benleadbeater.chromeDriver;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemobTest {
	WebDriver driver;
	String username = "admin";
	String password = "password";

	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.thedemosite.co.uk");
		WebElement gotoAddaUser = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		gotoAddaUser.click();
		WebElement SetUser = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		SetUser.sendKeys(username);
		WebElement SetPassword = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		SetPassword.sendKeys(password);
		WebElement SaveUserPass = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		SaveUserPass.click();
		WebElement GoToLogin = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		GoToLogin.click();
		WebElement EnterUser = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		EnterUser.sendKeys(username);
		WebElement EnterPass = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		EnterPass.sendKeys(password);
		WebElement Login = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		Login.click();
		WebElement Check = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		String Result = Check.getAttribute("innerText");
		Thread.sleep(5000);
		assertEquals("Login was not successful", "**Successful Login**", Result);
		Thread.sleep(5000);

	}
}
