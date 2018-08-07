package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Resizestep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Resizestepdef {
	Resizestep objRS = new Resizestep();
	
	
	@Given("^Iam resize page$")
	public void iam_resize_page() throws Throwable {
		objRS.openurl();
//		objRS.pauseAndplay();
	}

	@When("^I click resize button$")
	public void i_click_resize_button() throws Throwable {
		objRS.resize();
	}

	@Then("^I should see the size of the widget$")
	public void i_should_see_the_size_of_the_widget() throws Throwable {
	    
	}



}
