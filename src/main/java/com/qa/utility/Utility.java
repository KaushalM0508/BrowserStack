package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.pages.MobileSearchPage;

public class Utility extends MobileSearchPage {

	
	public static void selectFassured(String action)
	{
		if(action.equalsIgnoreCase("select"))
		{
			if(selectFassured.isSelected()==false)
			{
				selectFassured.click();	
			}
		}
		else if (action.equalsIgnoreCase("deselect"))
		{
			if(selectFassured.isSelected()==true)
			{
				selectFassured.click();	
			}
		}
		
	}
	
	public static void selectBrand(String brandName)
	{
		driver.findElement(By.xpath("//*[text()='"+brandName+"']")).click();
	}
	
	public static void waitTillElementToBeClickable(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
