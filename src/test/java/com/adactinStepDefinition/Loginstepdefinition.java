package com.adactinStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactinRunner.Runner;
import com.baseclass.org.Base_class;

//import com.baseclass.org.Base_class;

import cucumber.api.java.en.*;
import pom.org.Pom_class;
import pom.org.SearchHotels;

public class Loginstepdefinition extends Base_class {

	public static WebDriver driver = Runner.driver;
	Pom_class pc = new Pom_class(driver);
	SearchHotels sh = new SearchHotels(driver);

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/index.php");
	    
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	   
		inputValueElement(pc.getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	   
		inputValueElement(pc.getPassword(), arg1);
	}

	@Then("^User verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
	   
		clickOnElement(pc.getLoginbutton());
	}

	@When("^User selects the \"([^\"]*)\" as the location$")
	public void user_selects_the_as_the_location(String arg1) throws Throwable {
	   
		selection(sh.getLocation(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the hotels$")
	public void user_selects_the_as_the_hotels(String arg1) throws Throwable {
	   
		selection(sh.getHotels(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the room type$")
	public void user_selects_the_as_the_room_type(String arg1) throws Throwable {
	   
		selection(sh.getRoomtype(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the number of rooms$")
	public void user_selects_the_as_the_number_of_rooms(String arg1) throws Throwable {
	   
		selection(sh.getRoomno(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the checkin date$")
	public void user_selects_the_as_the_checkin_date(String arg1) throws Throwable {
	   
		selection(sh.getCheckin(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the checkout date$")
	public void user_selects_the_as_the_checkout_date(String arg1) throws Throwable {
	   
		selection(sh.getCheckout(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the number od adults$")
	public void user_selects_the_as_the_number_od_adults(String arg1) throws Throwable {
	   
		selection(sh.getAdultroom(), arg1, arg1);
	}

	@When("^User selects the \"([^\"]*)\" as the number of children$")
	public void user_selects_the_as_the_number_of_children(String arg1) throws Throwable {
		selection(sh.getChildroom(), arg1, arg1);
	    
	}

	@Then("^User verify the Valid Details$")
	public void user_verify_the_Valid_Details() throws Throwable {
		clickOnElement(sh.getSearch());
	    
	}

	
}
