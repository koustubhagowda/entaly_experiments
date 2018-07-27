package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qwinix.entaly.qa.StepsDefinitions;

public class Buttonsteps {

	WebDriver driver = StepsDefinitions.driver;
	
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://smartform.ikx.no/Array-Examples/Undo-and-redo-demo");
		Thread.sleep(3000);
	}
	
	public void enabled() throws InterruptedException {
	
	 boolean undo = driver.findElement(By.xpath("//button[text()='Undo']")).isEnabled();
	 System.out.println(undo);
	 boolean redo = driver.findElement(By.xpath("//button[text()='Redo']")).isEnabled();
	 System.out.println(redo);
}
	


}
