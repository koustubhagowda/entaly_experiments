package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qwinix.entaly.qa.StepsDefinitions;
import com.qwinix.entaly.qa.pages.Dummygraphpage;

public class playpausestep {
	
	WebDriver driver = StepsDefinitions.driver;
	Dummygraphpage objDP = new Dummygraphpage();
	public void openurl() throws InterruptedException {
		driver.get("https://owlcarousel2.github.io/OwlCarousel2/demos/autoplay.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	
	
	public void pauseAndplay() throws InterruptedException {
	boolean pause = driver.findElement(By.xpath("//a[text()='Stop']")).isEnabled();
		System.out.println(pause);
		driver.findElement(By.xpath("//a[text()='Stop']")).click();
		Thread.sleep(3000);
		boolean play = driver.findElement(By.xpath("//a[text()='Play']")).isEnabled();
		System.out.println(play);
		driver.findElement(By.xpath("//a[text()='Play']")).click();
		Thread.sleep(3000);
		

}
	
}
