package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Gridlinestep {
	
	WebDriver driver = StepsDefinitions.driver;
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.highcharts.com/demo/spline-inverted");
		Thread.sleep(3000);
	}
	
	public void gridline() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.highcharts.com/demo/spline-inverted");
		Thread.sleep(3000);
		 boolean elem = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][2]/*[name()='path']")).isEnabled();
		 System.out.println(elem);
	}
}
