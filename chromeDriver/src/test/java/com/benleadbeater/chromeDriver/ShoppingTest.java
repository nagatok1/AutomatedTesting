package com.benleadbeater.chromeDriver;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingTest {
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
		driver.get("http://automationpractice.com/index.php");

		WebElement TopSearch = driver.findElement(By.id("search_query_top"));
		TopSearch.sendKeys("Dress");

		WebElement TopSearchButton = driver.findElement(By.xpath("//*[@id='searchbox']/button"));
		TopSearchButton.click();

		WebElement SummerDress = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a"));
		SummerDress.isDisplayed();
		SummerDress.click();

		WebElement SummerDressSize = driver.findElement(By.id("group_1"));
		Select dropdown = new Select(SummerDressSize);
		dropdown.selectByVisibleText("L");

		WebElement SummerDressQuantity = driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span"));
		SummerDressQuantity.click();

		WebElement AddToCart = driver.findElement(By.id("add_to_cart"));
		AddToCart.click();

		WebElement ProceedToCheckout = driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a"));
		ProceedToCheckout.click();
		Thread.sleep(5000);

	}
}
