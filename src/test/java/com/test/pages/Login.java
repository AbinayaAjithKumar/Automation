package com.test.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.wrappers.CommonFunctionalities;

public class Login extends CommonFunctionalities {

	public Login invokeApp() {
		// TODO Auto-generated method stub

		launchingweb("http://localhost:8080/login.html?profile=Responsive");
		
		return this;

	}

	public Login enterUsernamePassword() {
		enterByXpath("//input[@id='usernameInput']", prob.getProperty("username"));
		enterByXpath("//input[@id='passwordInput']", prob.getProperty("password"));
		return this;
	}

	public Login signIn() {
		Click("//button[@id='loginButton']");
		return this;
	}

	/*
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get("http://localhost:8080/login.html?profile=Responsive");
	 * 
	 * 
	 * 
	 * Properties prob = new Properties();
	 * 
	 * FileInputStream file = new
	 * FileInputStream("src\\main\\resources\\login.properties"); prob.load(file);
	 * String username1 =prob.getProperty("username"); String
	 * password1=prob.getProperty("password");
	 * 
	 * 
	 * 
	 * driver.findElement(By.id("usernameInput")).sendKeys(username1);;
	 * driver.findElement(By.id("passwordInput")).sendKeys(password1);
	 * 
	 * 
	 * 
	 * 
	 * WebElement signInButton = driver.findElement(By.id("loginButton"));
	 * signInButton.click();
	 * 
	 * 
	 * Thread.sleep(3000);
	 * 
	 * 
	 * WebElement newRequest =
	 * driver.findElement(By.xpath("//span[text()='New Request']"));
	 * 
	 * Thread.sleep(3000); newRequest.click();
	 */

}
