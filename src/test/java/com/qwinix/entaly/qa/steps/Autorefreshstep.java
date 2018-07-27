package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Autorefreshstep {
	
	WebDriver driver = StepsDefinitions.driver;
	
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://entaly-demo.herokuapp.com/");
		Thread.sleep(3000);
	}
	
	public void enabled() throws InterruptedException {
	 boolean elem = driver.findElement(By.xpath("//div[@class='switch-toggle']")).isEnabled();
	 System.out.println(elem);
	}
	
	public void autorefresh_click() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='switch-toggle']")).click();
		Thread.sleep(3000);
	}
	

}
