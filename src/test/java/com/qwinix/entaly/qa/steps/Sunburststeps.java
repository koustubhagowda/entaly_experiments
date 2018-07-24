package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Dummygraphpage;

public class Sunburststeps {
	
	WebDriver driver = StepsDefinitions.driver;
	Dummygraphpage objDP = new Dummygraphpage();
	
	public void getdata_sunburst_chart() throws InterruptedException {

 	driver.manage().window().maximize();
	driver.get("https://www.highcharts.com/demo/sunburst");
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,300)", "");
	int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][5]/*[name()='g'][1]/*[name()='path']")).size();
	Thread.sleep(3000);
	System.out.println(size);
	for(int i=1;i<=size;i++) {
	WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][5]/*[name()='g'][1]/*[name()='path'][" + i +"]")); 
	Thread.sleep(3000);
	objDP.onMouseOver(element);
	Thread.sleep(3000);
  	String text =  driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][11]/*[name()='text']")).getText();
  	System.out.println(text);
		
	}

	}
}
