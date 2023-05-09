package SourceSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class loginProcess {


@Test
	public  void result() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("www.google.com");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Instagram"+Keys.ENTER);
		
		WebElement clickLink = driver.findElement(By.partialLinkText("Instagram"));
		clickLink.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("saaiabinayasri@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("saaiaadhisha");
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		loginButton.click();
	}

}
