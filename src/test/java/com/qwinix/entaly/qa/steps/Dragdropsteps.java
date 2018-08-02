package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qwinix.entaly.qa.StepsDefinitions;

public class Dragdropsteps {
	WebDriver driver = StepsDefinitions.driver;
	
	public void openurl() throws InterruptedException {
		driver.manage().window().maximize();
//		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
//		driver.get("https://html5demos.com/drag/#");
		driver.get("https://demos.telerik.com/kendo-ui/listbox/drag-and-drop");

		Thread.sleep(3000);
	}
	
	public void draganddrop() throws InterruptedException {
	    driver.findElement(By.xpath(".//*[@id='example']/div/div[1]/div/ul/li[1]")).click();
        WebElement elementToMove = driver.findElement(By.xpath(".//*[@id='example']/div/div[1]/div/ul/li[1]"));
        WebElement moveToElement = driver.findElement(By.xpath(".//*[@id='example']/div/div[2]/div/ul/li[4]"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(elementToMove, moveToElement).build().perform();
        Thread.sleep(3000);
        
}

}
