package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.ZoominAndzoomoutsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZoominAndzoomoutstepdef {
	ZoominAndzoomoutsteps objZS = new ZoominAndzoomoutsteps();
	
	@Given("^Iam on zoomin/zoomout page$")
	public void iam_on_zoomin_zoomout_page() throws Throwable {
		objZS.opeen_url();
	}

	@When("^I click zoomin/zoomout button$")
	public void i_click_zoomin_zoomout_button() throws Throwable {
		objZS.zoomin_zoomout();
	}

	@Then("^I should see the zoomin/zoomout views$")
	public void i_should_see_the_zoomin_zoomout_views() throws Throwable {
	    
	}


}
