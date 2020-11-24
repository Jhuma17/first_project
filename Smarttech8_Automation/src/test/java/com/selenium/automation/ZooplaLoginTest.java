  package com.selenium.automation;

  
  import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

  public class ZooplaLoginTest {

	    static WebDriver driver;

       public static void main(String[] args) {
	
    	System. setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
   		
   		WebDriver driver=new ChromeDriver();
   	
   	    driver.navigate().to("https://www.zoopla.com/");    
   	    
   	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	    driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
       
        driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();
       
        driver.findElement(By.name("signin_email")).sendKeys("jhumarayyan@gmail.com");
       
        driver.findElement(By.name("signin_password")).sendKeys("Tuktuki2712");
       
        driver.findElement(By.id("signin_submit")).click();
       
       driver.findElement(By.id("search-input-location")).sendKeys("NewYork,Lincoln");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.cssSelector("#search-submit")).click();
       
       /* WebElement element = driver.findElement(By.xpath("//select[@id='sort-order-dropdown']"));
		  Select se = new Select(element);
         List <WebElement> list = se.getOptions();
         for(int i = 0; i<list.size(); i++) {
        	System.out.println( list.get(i).getText() );
         }*/
        /* driver.findElement(By.xpath("(//a[@data-testid='listing-details-link'])[5]")).click();
      
         driver.findElement(By.xpath("(//div[@class='ui-agent__logo'])[1]")).click();
        
        driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/h1[1]")).click();
         
         driver.findElement(By.linkText("+44 24 7511 8874")).click();*/
         driver.findElement(By.id("sort-order-dropdown")).sendKeys("Highest Price");
         
         WebElement element = driver.findElement(By.xpath("//option[contains(text(),'Highest price')]']"));
		  Select se = new Select(element);
        List <WebElement> list = se.getOptions();
        for(int i = 0; i<list.size(); i++) {
       	System.out.println( list.get(i).hashCode());}
       
       
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
         
       System.out.println(driver.getTitle());
        
         //driver.quit();
       
      
       
       
       
       
       }
       
  }     
       
       
       
       /*("msedge")
	  System.setProperty("webdriver.msedge.driver",./Driver/msedgedriver.exe)     */
       
       
       


