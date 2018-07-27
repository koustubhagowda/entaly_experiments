package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Autorefreshstep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Autorefreshstepdef {
	
	Autorefreshstep objAS = new Autorefreshstep();
	

	@Given("^Iam on dashboard autorefresh button page$")
	public void iam_on_dashboard_autorefresh_button_page() throws Throwable {
		objAS.openurl();
	}

	@When("^I click on autorefresh button$")
	public void i_click_on_autorefresh_button() throws Throwable {
		objAS.enabled();
	}

	@Then("^I should see the homepage is automaticaly update the information$")
	public void i_should_see_the_homepage_is_automaticaly_update_the_information() throws Throwable {
		objAS.autorefresh_click();
	}
}
