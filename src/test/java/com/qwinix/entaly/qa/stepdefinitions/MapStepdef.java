package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.MapSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MapStepdef
{
	MapSteps  objP = new MapSteps();
	@Given("^I am on mappage$")
	public void i_am_on_mappage() throws Throwable
	{
		objP.map_data();
	}

	@When("^I navigate to perticular map$")
	public void i_navigate_to_perticular_map() throws Throwable {
	    
	}

	@Then("^I should albe to fetch data with in map$")
	public void i_should_albe_to_fetch_data_with_in_map() throws Throwable {
	    
	}

}
