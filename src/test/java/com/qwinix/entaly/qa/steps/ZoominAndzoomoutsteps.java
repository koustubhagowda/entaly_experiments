package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.StepsDefinitions;

public class ZoominAndzoomoutsteps {
	WebDriver driver = StepsDefinitions.driver;
	
	public void opeen_url() throws InterruptedException {
		driver.get("https://www.highcharts.com/maps/demo/doubleclickzoomto");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)", "");
	}
	
	public void zoomin_zoomout() throws InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
		WebElement ele=	driver.findElement(By.xpath("(//*[@class=' highcharts-button-box'])[2]"));
		act.moveToElement(ele).click().build().perform();
		
		}
		WebElement we =	driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='path'][213]"));
		Actions action = new Actions(StepsDefinitions.driver);
		action.moveToElement(we).perform();
		String text =  driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][6]/*[name()='text'][2]")).getText();
	  	System.out.println(text);
		
		
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			WebElement ele=	driver.findElement(By.xpath("(//*[@class=' highcharts-button-box'])[3]"));
			act.moveToElement(ele).click().build().perform();
		}
		
		}
	
	public void undo() {
		
	}
}
