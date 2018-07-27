package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Buttonsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buttonstepdef {
	Buttonsteps objBS = new Buttonsteps();


	@Given("^Iam on dashboard undo button page$")
	public void iam_on_dashboard_undo_button_page() throws Throwable {
		objBS.openurl();
	}

	@When("^I click undo button$")
	public void i_click_undo_button() throws Throwable {
		objBS.enabled();
	}

	@Then("^I should see the pervious action$")
	public void i_should_see_the_pervious_action() throws Throwable {
	    
	}
}
