package com.testPack.SampleProject4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHomePage {

	public static WebDriver driver;
	
	By gmailLink = By.linkText("Gmail");
	By imagesLink = By.linkText("Images");
	By searchTextBox = By.id("APjFqb");
	By searchButton = By.name("btnK");
	
	
	  @BeforeTest
	  public void driverSetUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\S L Narasimman\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("http://www.google.com");
		  driver.manage().window().maximize();
	  }

	
  @Test(enabled=false)
  public void verifyGmailLink() {
	  
	  if(driver.findElement(gmailLink).isDisplayed()){
		  driver.findElement(gmailLink).click();
	  }
	  //driver.navigate().back();
  }
  
  @Test
  public void verifyImagesLink() {
	  
	  
//	  if(driver.findElement(imagesLink).isDisplayed()) {
//		  driver.findElement(imagesLink).click();
//	  }
//	  driver.navigate().back();
  }

  @Test
  public void enterTextToSearch() {
	  driver.findElement(searchTextBox).sendKeys("Selenium Books");
	  driver.findElement(searchButton).click();
	  	  
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  
  @AfterTest
  public void tearDown() {
	  //driver.quit();
  }

}
