   package com.selenium.automation;

   import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

   public class AmazonFunctionalTest {

	public static void main(String[] args) {


   System. setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

     WebDriver driver=new ChromeDriver();
	
	 driver.get("https://www.amazon.com/");
	 
	 driver.manage().window().maximize();
	
     WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
       ele.click();
	
     WebElement ele1=driver.findElement(By.name("email"));
	      ele1.sendKeys("jhumasadia@icloud.com");
	
	 WebElement ele2=driver.findElement(By.id("continue"));
	      ele2.click();
	
	 WebElement ele3=driver.findElement(By.name("password"));
	      ele3.sendKeys("Tuktuki2712");
	      
	 WebElement ele4=driver.findElement(By.id("signInSubmit"));
	       ele4.click();
	
	 System.out.println(driver.getTitle());
	
	 WebElement ele5=driver.findElement(By.linkText("Whole Foods"));
	        ele5.click();
	 
	     // How to enter text & hit enter key button
	    	WebElement enterText = driver.findElement(By.id("twotabsearchtextbox"));
	    	enterText.sendKeys("Iphone");
	    	enterText.sendKeys(Keys.ENTER);  
	    }
	    	
	    	// 
	    /*	List <WebElement> list = driver.findElements(By.xpath("//*[@class='a-price']"));
	    	System.out.println("Total iphone count num :" + list.size());
	    	for(WebElement select : list) {
	    		String listPrice = select.getText();
	    		System.out.println("Iphione price list :" +listPrice);		
	    	}
	    	for(int i =0; i<list.size();i++) {
	    		if(i>7) {
	    			System.out.println("Selected num : "+i);
	    			System.out.println("Iphone Iphone Price : "+list.get(i).getText());
	    			list.get(i).click();
	    			break;
	    		}     */
	 
	/*Actions action = new Actions(driver);
	WebElement mousHover =driver.findElement(By.id("nav-link-accountList"));
	action.moveToElement(mousHover);//.build().perform();
	action.click().build().perform();  */

	
	
   
	}


