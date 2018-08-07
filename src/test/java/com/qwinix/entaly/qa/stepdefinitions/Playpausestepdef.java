package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.playpausestep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Playpausestepdef {
	playpausestep objPS = new playpausestep();
	
	@Given("^Iam on play and pause homepage$")
	public void iam_on_play_and_pause_homepage() throws Throwable {
		objPS.openurl();
	}

	@When("^I click play and pause$")
	public void i_click_play_and_pause() throws Throwable {
		objPS.pauseAndplay();
	}

	@Then("^I should see the play and pause function$")
	public void i_should_see_the_play_and_pause_function() throws Throwable {
	   
	}



}
