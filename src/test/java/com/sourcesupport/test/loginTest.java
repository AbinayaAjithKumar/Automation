package com.sourcesupport.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class loginTest {

@Test
	public   void login() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/login.html?profile=Responsive");
		
		Properties prob = new Properties();
		
		FileInputStream file = new FileInputStream("src\\main\\resources\\login.properties");
		prob.load(file);
		
		String username1 =prob.getProperty("username");
        String password1 = prob.getProperty("password");
        
        driver.findElement(By.id("usernameInput")).sendKeys(username1);;
        driver.findElement(By.id("passwordInput")).sendKeys(password1);
        
        
        WebElement signInButton = driver.findElement(By.id("loginButton"));
		signInButton.click();
		
		Thread.sleep(3000);
	
		WebElement newRequest = driver.findElement(By.xpath("//span[text()='New Request']"));
		
		Thread.sleep(3000);
		newRequest.click();
        
	}

}
