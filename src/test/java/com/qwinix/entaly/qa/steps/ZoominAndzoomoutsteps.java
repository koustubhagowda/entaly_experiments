package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
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
	}
	
	public void zoomin_zoomout() throws InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
		WebElement ele=	driver.findElement(By.xpath("(//*[@class=' highcharts-button-box'])[2]"));
		act.moveToElement(ele).click().build().perform();
		}
		
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			WebElement ele=	driver.findElement(By.xpath("(//*[@class=' highcharts-button-box'])[3]"));
			act.moveToElement(ele).click().build().perform();
		}
	
	}

}
