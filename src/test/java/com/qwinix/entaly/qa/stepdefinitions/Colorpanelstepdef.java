package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Colorpanelsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Colorpanelstepdef {
	Colorpanelsteps objCP = new Colorpanelsteps();
	
	@Given("^Iam on color pannel page$")
	public void iam_on_color_pannel_page() throws Throwable {
		objCP.openurl();
	}

	@When("^I choose the color set$")
	public void i_choose_the_color_set() throws Throwable {
		objCP.colorpanel();
	}

	@Then("^I should see the specified color set in graph$")
	public void i_should_see_the_specified_color_set_in_graph() throws Throwable {

	}



}
