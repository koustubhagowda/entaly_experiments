package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Colorsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Colorstepdef {
	Colorsteps objCS = new Colorsteps();
	
	@Given("^Iam on  color text page$")
	public void iam_on_color_text_page() throws Throwable {
		objCS.openurl();
	}

	@When("^I verify the particular color of the text$")
	public void i_verify_the_particular_color_of_the_text() throws Throwable {
		objCS.verifycolor();
	}

	@Then("^I should see the specified color$")
	public void i_should_see_the_specified_color() throws Throwable {
	    
	}



}
