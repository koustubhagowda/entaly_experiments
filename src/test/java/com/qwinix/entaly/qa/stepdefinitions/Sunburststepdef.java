package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Sunburststeps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sunburststepdef {
	Sunburststeps objSS = new Sunburststeps();
	
	@Given("^Iam on sunbrust homepage$")
	public void iam_on_sunbrust_homepage() throws Throwable {
		objSS.getdata_sunburst_chart();
	}

	@When("^I navigate to sunbrust page$")
	public void i_navigate_to_sunbrust_page() throws Throwable {
	   
	}

	@Then("^I should able to fetch all data in sunbrust page$")
	public void i_should_able_to_fetch_all_data_in_sunbrust_page() throws Throwable {
	   
	}

}
