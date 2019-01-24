package com.benleadbeater.Features;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingHome {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	private WebElement SearchBox;

	@FindBy(id = "sb_form_go")
	private WebElement SearchButton;

	public void Search(String arg0) {
		SearchBox.sendKeys(arg0);
		SearchBox.sendKeys(Keys.ENTER);
		
	}
}
