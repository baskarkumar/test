package com.fullflow.webconsole.com.allmodules.test;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.IO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	public String baseurl ="https://stage-console.smartscaffolder.services";		
	public WebDriver driver;
	
	
		
	@BeforeTest
	public void setbaseurl() throws Exception {
	try 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseurl);
	
	}catch(Exception e)
{
		throw(e);

	}
	}
	
	@Test
	public void login1()
	{
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.id("logonIdentifier")).sendKeys("admin@stage-damarscaffolding.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("next")).click();
	}	
	



	@Test
	public void addingstaff()
	{
		 WebDriverWait wait = new WebDriverWait(driver, 300);
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/hub-root/hub-main/div/div/hub-home-screen/div/div[1]/div/div[1]/h2")));		 
		 driver.findElement(By.id("//*[@id='staff']/a/i")).click();	
	
}

}