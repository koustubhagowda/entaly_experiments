package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Dragdropsteps {
	WebDriver driver = StepsDefinitions.driver;
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		Thread.sleep(3000);
	}
	
	public void draganddrop() throws InterruptedException {
	  
	    WebElement From = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
	    WebElement To = driver.findElement(By.xpath("//*[@id='mydropzone']"));
	    Actions builder = new Actions(driver);
	    Action dragAndDrop = builder.clickAndHold(From)
	    .moveToElement(To)
	    .release(To)
	    .build();
	    dragAndDrop.perform();
	    Thread.sleep(3000);
}

}
