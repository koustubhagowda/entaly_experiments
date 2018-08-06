package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Dummygraphpage;

public class Linestep {

	WebDriver driver = StepsDefinitions.driver;
	Dummygraphpage objDP = new Dummygraphpage();
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.highcharts.com/demo/line-basic");
		Thread.sleep(3000);
	}
	
	public void angel_button() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][5]/*[name()='g'][4]/*[name()='path']")).size();
		Thread.sleep(3000);
		System.out.println(size);
		for(int i=1;i<=size;i++) {
		
			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][5]/*[name()='g'][4]/*[name()='path'][" + i +"]")); 
			objDP.onMouseOver(element);
			Thread.sleep(3000);
	  		String text = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][13]/*[name()='text']")).getText();
	  		System.out.println(text);
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[3]/a[2]/i")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)", "");
		int size1 = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g'][2]/*[name()='path']")).size();
		Thread.sleep(3000);
		System.out.println(size1);
		for(int i=1;i<=size1;i++) {
			
			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g'][2]/*[name()='path'][" + i +"]")); 
			objDP.onMouseOver(element);
			Thread.sleep(3000);
	  		String text = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][15]/*[name()='text']")).getText();
	  		System.out.println(text);
			
		}
		
	}

}
