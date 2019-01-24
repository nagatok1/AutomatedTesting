package com.benleadbeater.passionTea;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clickAll {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[2]/a")
	private WebElement OurPassion;

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement Menu;

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[4]/a")
	private WebElement TalkTea;

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement CheckOut;

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[1]/a")
	private WebElement Welcome;

	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement CheckOut1;

	public void Screenshot() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
	}

	public void clickMenu() {
		Menu.click();
	}

	public void clickallmenus() {
		OurPassion.click();
		// Screenshot();
		Menu.click();
		// Screenshot();
		CheckOut1.click();
		// Screenshot();
		TalkTea.click();
		// Screenshot();
		CheckOut.click();
		// Screenshot();
		Welcome.click();
		// Screenshot();
	}
}