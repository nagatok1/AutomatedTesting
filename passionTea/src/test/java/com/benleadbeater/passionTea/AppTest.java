package com.benleadbeater.passionTea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.benleadbeater.passionTea.clickAll;
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

@Before
public void setup() throws InterruptedException {
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

@Given("^the correct web address$")
public void the_correct_web_address() {
	driver.manage().window().maximize();
	driver.get("http://www.practiceselenium.com/");
	test.log(LogStatus.INFO,"Correct URL");
}

@When("^I navigate to the 'Menu' page$")
public void i_navigate_to_the_Menu_page() {
	
	clickAll Page = PageFactory.initElements(driver, clickAll.class);
	Page.clickMenu();
}

@Then("^I can browse a list of the available products\\.$") 
public void i_can_browse_a_list_of_the_available_products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click the checkout button$")
public void i_click_the_checkout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I am taken to the checkout page$")
public void i_am_taken_to_the_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}
