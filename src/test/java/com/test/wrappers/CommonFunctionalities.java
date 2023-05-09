package com.test.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonFunctionalities 

{
	public static WebDriver driver;
	public static Properties prob;
//	CommonFunctionalities object1 = new CommonFunctionalities();
	
	@BeforeSuite
	public void properties()
	{
		prob = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("src\\main\\resources\\login.properties");
			prob.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		driver = new ChromeDriver();
		
	}
	
	
    
	
	public void launchingweb(String url)
	{
       
		driver.get(url);
		
	}

	public void enterByXpath(String xpath, String data) 
	{
		
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		
	}
	
	
	public void Click(String xpath)
	{
		WebElement clickButton = driver.findElement(By.xpath(xpath));
		clickButton.click();
	}
     
}
