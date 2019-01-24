package com.benleadbeater.Features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppTest {

	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;
	String CurrentSearch = "";

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\testExtent.html", false);
		test = report.startTest("Verify Application Title");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
		report.flush();
	}

	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
		driver.manage().window().maximize();
		driver.get(arg1);
		test.log(LogStatus.INFO,"Correct URL");
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws InterruptedException {
		BingHome Page = PageFactory.initElements(driver, BingHome.class);
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sb_form_q\"]")));
		myDynamicElement.click();
		Page.Search(arg1);
		CurrentSearch = arg1.replace(" ","+");
		System.out.println(CurrentSearch);
		test.log(LogStatus.INFO,"Correct Search");
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
		test.log(LogStatus.INFO,"Correct Page");
		assertTrue(driver.getCurrentUrl().contains(CurrentSearch));
	
	}
}
