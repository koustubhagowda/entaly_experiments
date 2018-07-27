package com.qwinix.entaly.qa.stepdefinitions;

import com.qwinix.entaly.qa.steps.Dragdropsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dragdropstepdef {
	 Dragdropsteps objDS = new  Dragdropsteps();
	
	 
	 @Given("^Iam on drag and drop page$")
	 public void iam_on_drag_and_drop_page() throws Throwable {
		 objDS.openurl();
	 }

	 @When("^I drag the image from image floder to trash$")
	 public void i_drag_the_image_from_image_floder_to_trash() throws Throwable {
		 objDS.draganddrop();
	 }

	 @Then("^I should see the image in the Trash$")
	 public void i_should_see_the_image_in_the_Trash() throws Throwable {
	     
	 }




}
