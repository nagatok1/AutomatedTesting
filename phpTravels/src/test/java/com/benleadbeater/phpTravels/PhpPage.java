package com.benleadbeater.phpTravels;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpPage {
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

	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a/span[1]")
	private WebElement searchBox;

	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement searchBoxInput;

	@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
	private WebElement FromDate;

	@FindBy(xpath = "//*[@id=\"dpd2\"]/div/input")
	private WebElement ToDate;

	@FindBy(xpath = "//*[@id=\"hotels\"]/form/div[5]/button")
	private WebElement GoButton;

	public void searchfor(String text1, String text2, String text3, WebDriver driver) throws InterruptedException {
		searchBox.click();
		searchBoxInput.sendKeys(text1);
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]")));
		myDynamicElement.click();
		FromDate.sendKeys(text2);
		ToDate.sendKeys(text3);
		GoButton.click();
		Thread.sleep(1000);
	}

	@Test
	public void FindLondonHotels() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		PhpPage Page = PageFactory.initElements(driver, PhpPage.class);
		Page.searchfor("london", "22/01/2019", "23/01/2019", driver);
		Thread.sleep(5000);
	}
}