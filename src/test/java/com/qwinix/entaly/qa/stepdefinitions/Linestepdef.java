package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Linestep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Linestepdef {
	Linestep objLS = new Linestep();
	
	@Given("^Iam on linepage$")
	public void iam_on_linepage() throws Throwable {
		objLS.openurl();
	}

	@When("^I navigate the line chart$")
	public void i_navigate_the_line_chart() throws Throwable {
		objLS.angel_button();
	}

	@Then("^I should fetch all data$")
	public void i_should_fetch_all_data() throws Throwable {
	    
	}



}
