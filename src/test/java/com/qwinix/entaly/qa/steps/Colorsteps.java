package com.qwinix.entaly.qa.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Colorsteps {
	WebDriver driver = StepsDefinitions.driver;
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/css/css_text.asp");
		Thread.sleep(3000);
		
	}
	
	public void verifycolor() throws InterruptedException {
//		String color = driver.findElement(By.xpath("//h1[text()='text formatting']")).getCssValue("color");
//		System.out.println(color);
//		
//		String color = driver.findElement(By.xpath("//h1[text()='text formatting']")).getCssValue("color").trim();    
//		 System.out.println("RGB_Color: " + color);  
//
//		 //  RGB to HEX   
//		 String color_hex[];  
//		 color_hex = color.replace("rgba(", "").split(",");       
//		 String actual_hex = String.format("#%02x%02x%02x", Integer.parseInt(color_hex[0].trim()), Integer.parseInt(color_hex[1].trim()), Integer.parseInt(color_hex[2].trim()));  
//
//		// further can verify with Actual hex value with Expected hex value  
//		 Assert.assertEquals("actual_hex should equal to: ", "#4caf50", actual_hex);
//		 System.out.println("hex_Color: " + actual_hex);  
		  
		 String color = driver.findElement(By.xpath("//h1[text()='text formatting']")).getCssValue("color");
		 System.out.println(color);
		 String hex = Color.fromString(color).asHex();
		 System.out.println(hex);
	}

}
