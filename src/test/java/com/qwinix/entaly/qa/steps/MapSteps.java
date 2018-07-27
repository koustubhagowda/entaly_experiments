package com.qwinix.entaly.qa.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qwinix.entaly.qa.StepsDefinitions;

public class MapSteps
{
	WebDriver driver = StepsDefinitions.driver;
//	Mappage objDP = new Mappage();
	public void map_data() throws InterruptedException
	{
		
 		driver.manage().window().maximize();
		driver.get("https://tomchentw.github.io/react-google-maps/#ui-components");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,30000)", "");
//		int size = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][1]/*[name()='circle']")).size();
//		Thread.sleep(3000);
//		System.out.println(size);
//		for(int i=1;i<=size;i++)
//		{
//			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][1]/*[name()='circle'][" + i +"]")); 
//			objDP.onMouseOver(element);
//			Thread.sleep(3000);
//	  		String text = driver.findElement(By.xpath("//div[@class='amcharts-balloon-div']")).getText();
//	  		System.out.println(text);	
//		}
//		int sizeof = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][2]/*[name()='path']")).size();
//		Thread.sleep(3000);
//		System.out.println(sizeof);
//		for(int j=1;j<=sizeof;j++)
//		{
//			WebElement element = driver.findElement(By.xpath("//*[name()='svg']/*[name()='g'][12]/*[name()='g'][2]/*[name()='path'][" + j +"]")); 
//			objDP.onMouseOver(element);
//			Thread.sleep(3000);
//	  		String text = driver.findElement(By.xpath("//div[@class='amcharts-balloon-div']")).getText();
//	  		System.out.println(text);	
//		}
	}
	

}
