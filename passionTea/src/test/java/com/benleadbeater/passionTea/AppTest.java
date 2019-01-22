package com.benleadbeater.passionTea;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest { 

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


}
