package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Gridlinestep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gridlinestepdef {
	Gridlinestep objGS = new Gridlinestep();
	
	
	@Given("^Iam on dashboard gridline page$")
	public void iam_on_dashboard_gridline_page() throws Throwable {
		objGS.openurl();
	}

	@When("^I check the gridline button is disbaled$")
	public void i_check_the_gridline_button_is_disbaled() throws Throwable {
		objGS.gridline();
	}

	@Then("^I should see the current page$")
	public void i_should_see_the_current_page() throws Throwable {
	  
	}




}
