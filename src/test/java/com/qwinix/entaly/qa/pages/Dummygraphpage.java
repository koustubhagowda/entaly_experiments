package com.qwinix.entaly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Dummygraphpage {
		
		public void onMouseOver(WebElement we)
		{
			Actions action = new Actions(StepsDefinitions.driver);
			action.moveToElement(we).perform();

		}
		@FindBy(xpath="//div[@class='amcharts-balloon-div']")
		public WebElement gettext;
	}

