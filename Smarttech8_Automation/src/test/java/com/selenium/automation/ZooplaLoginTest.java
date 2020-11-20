  package com.selenium.automation;

  
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

  public class ZooplaLoginTest {

	    static WebDriver driver;

       public static void main(String[] args) {
	
    	System. setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe");
   		
   		WebDriver driver=new EdgeDriver();
   	
   	    driver.navigate().to("https://www.zoopla.com/");    
   	    
   	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
       
        driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();
       
        driver.findElement(By.name("signin_email")).sendKeys("jhumarayyan@gmail.com");
       
        driver.findElement(By.name("signin_password")).sendKeys("Tuktuki2712");
       
        driver.findElement(By.id("signin_submit")).click();
       
        System.out.println(driver.getTitle());
       
        //driver.findElement(By.partialLinkText("House prices")).click();
       
       // driver.findElement(By.linkText("Find agents")).click();
        
       // driver.findElement(By.xpath("(//*[@data-testid='header-profilemenu-sign-out'])[1]")).click();
       
        driver.quit();
       
        System.out.println("Test Pass");
       
       
       
       
       
       }
       
  }     
       
       
       
       /*("msedge")
	  System.setProperty("webdriver.msedge.driver",./Driver/msedgedriver.exe)     */
       
       
       


