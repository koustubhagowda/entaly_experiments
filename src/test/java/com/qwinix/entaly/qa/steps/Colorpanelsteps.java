package com.qwinix.entaly.qa.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Colorpanelsteps {
	WebDriver driver = StepsDefinitions.driver;

	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
//		driver.get("https://demos.telerik.com/kendo-ui/colorpicker/index");
		driver.get("https://www.w3schools.com/colors/colors_picker.asp");
		Thread.sleep(4000);
		}

	public void colorpanel() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id='palette']/table/tbody/tr[2]/td[2]"));
		action.moveToElement(we).perform();
		String rgb =  we.getCssValue("background-color");
		System.out.println(rgb);
		String hex= Color.fromString(rgb).asHex();
		System.out.println(hex);
		Thread.sleep(3000);
		 
		 WebElement piccolor = driver.findElement(By.xpath("//*[@id='palette']/table/tbody/tr[2]/td[2]"));
		 piccolor.click();
		 Thread.sleep(3000);
		 WebElement backgroundcolor = driver.findElement(By.xpath("//*[@id='background']"));
		 String color2 = backgroundcolor.getCssValue("background-color");
		 System.out.println(color2);
		 String hex1= Color.fromString(color2).asHex();
		 System.out.println(hex1);
		 Thread.sleep(3000);
		try {
		    Assert.assertEquals(hex, hex1);
		} catch (AssertionError e) {
		    System.out.println("Not equal");
		throw e;
		}
		System.out.println("Equal");
		
	}

}
