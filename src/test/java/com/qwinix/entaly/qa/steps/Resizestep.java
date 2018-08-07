package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Resizestep {
	WebDriver driver = StepsDefinitions.driver;
	
	public void openurl() throws InterruptedException {
		driver.get("https://www.highcharts.com/demo/responsive");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		
	}
	
	
	
	public void resize() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement we =	driver.findElement(By.xpath("//button[text()='Small']"));
		action.moveToElement(we).click().build().perform();
		Thread.sleep(3000);
		WebElement we2 =	driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][5]/*[name()='g'][1]/*[name()='rect'][2]"));
		Thread.sleep(3000);
		Actions action1 = new Actions(StepsDefinitions.driver);
		action1.moveToElement(we2).perform();
		Thread.sleep(3000);
		String text =  driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][9]/*[name()='text']")).getText();
	  	System.out.println(text);
		WebElement we1 =	driver.findElement(By.xpath("//button[text()='Large']"));
		action.moveToElement(we1).click().build().perform();
		Thread.sleep(3000);
	
		}
	

		
}
