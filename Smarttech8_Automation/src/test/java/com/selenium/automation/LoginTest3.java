package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		

	System. setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
			      
			   driver.get("https://admin-demo.nopcommerce.com/"); //https://phptravels.net/login
	
	           driver.manage().window().maximize();
	          
	     WebElement ele =driver.findElement(By.id("Email"));//(//input[@type='email'])[1]
	               ele.sendKeys("admin@yourstore.com");
	              
	           WebElement ele1 =driver.findElement(By.id("Password"));//txtPassword
	               ele1.sendKeys("admin");//admin123
	
	           WebElement ele2 =driver.findElement(By.xpath("//*[@value='Log in']"));
	               ele2.click();
	
	          // System.out.println(driver.getTitle());*/
	
	         
	              
	
	
	
	
	}

}
