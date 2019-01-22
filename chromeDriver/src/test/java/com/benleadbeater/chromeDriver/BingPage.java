package com.benleadbeater.chromeDriver;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BingPage {
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

	@FindBy(name = "q")
	private WebElement searchBox;
	
	@FindBy(id = "sb_form_go")
	private WebElement GoButton;

	public void searchfor(String text) {
		searchBox.sendKeys(text);
		GoButton.click();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://www.bing.com");
		BingPage Page = PageFactory.initElements(driver, BingPage.class);
		Page.searchfor("Dave");
		Thread.sleep(5000);

	}
}