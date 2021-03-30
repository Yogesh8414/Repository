package com.adactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinfeature", 
					glue = " com//adactinStepDefinition", 
					monochrome = true)
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = Base_class.getDriver("chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
