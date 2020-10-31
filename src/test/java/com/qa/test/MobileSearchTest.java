package com.qa.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.MobileSearchPage;

public class MobileSearchTest  extends TestBase{
	
	MobileSearchPage mobileSearchPage=null;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser)
	{
		setup(browser);
		mobileSearchPage =new MobileSearchPage();
	}
	
	@Test
	public void getProductDetailsTest()
	{
		MobileSearchPage.getProductDetails();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	

}
