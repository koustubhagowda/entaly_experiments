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
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
	}
	
	public void draganddrop() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
	    WebElement fromElement= driver.findElement(By.xpath("//div[1]/ul/li[1]"));
		Thread.sleep(3000);
	    WebElement toElement=driver.findElement(By.xpath("//div[1]/div"));
		Thread.sleep(3000);
	    Actions action = new Actions(StepsDefinitions.driver);
		Thread.sleep(3000);
	    Action dragDrop = action.dragAndDrop(fromElement, toElement).build();
		Thread.sleep(3000);
	    dragDrop.perform(); 
	    Thread.sleep(6000);
}

}
