package com.maven.turtlemint.com.maven.turtlemintIns;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;  
  
public class SeleniumScript1
{


	@Test	
  public void testGoogle()  throws InterruptedException{
  
		System.setProperty("webdriver.chrome.driver", "E:\\kalpana\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        Thread.sleep(3000);
	  driver.get("http://turtlemint.com");
    String title=driver.getTitle();
    if(title.equals("Turtlemint"))
    {
      System.out.println("Pass:Title is Turtlemint");
    }
    else
    {
      System.out.println("Fail:Title is not Turtlemint: actual title is"+title);
    }
   driver.findElement(By.xpath("//*[@id='page']/div[3]/div/div/div/div[2]/a[4]")).click();
  Thread.sleep(10000);
  WebElement m = driver.findElement(By.xpath("//*[local-name()='svg' and @data-name='close']/*[local-name()='path']"));
	Actions act=new Actions(driver);
	act.click().build().perform();
   
   
   WebElement ele = driver.findElement(By.xpath("//*[@id='page']/div[4]/div/div/div/div[2]/div[1]/div[3]/span"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", ele);
   
   try{
    driver.findElement(By.xpath("//*[@id='Radio-F']")).click();
    
    
   }catch(NoSuchElementException e)
   {
	   System.out.println("Exception");
   }    

    
    WebElement ele1 = driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/input"));
    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    executor1.executeScript("arguments[0].click();", ele1);
   
    
    Select s = new Select(driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/select[1]")));
    s.selectByVisibleText("1996");
    
    Select s1 = new Select(driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/select[2]")));
    s1.selectByIndex(1);
   
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]")).click();
   driver.findElement(By.id("Radio-false")).click();  
   
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[4]/div[2]/div/div/div/span")).click();
   
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div[4]/div[2]/div/div/div")).click();
   
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[3]/button[2]/span")).click();
   
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/span")).click();

   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[2]")).click();
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[3]/button[2]")).click();
   
   driver.findElement(By.name("customerName")).sendKeys("Kalpana Mane");
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div/input")).sendKeys("8788982826");  
	
   driver.findElement(By.name("paidUserEmail")).sendKeys("manekalpana912@gmail.com");  
   Thread.sleep(1000);
	
   driver.findElement(By.xpath("//*[@id='root']/div/section/div/div/div[3]/button[2]")).click();
   
   driver.findElement(By.xpath("//*[@id='page']/div/div[3]/ui-view/div/div/div[1]/tm-fields/div/div[2]/div[2]/button")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id='page']/div/div[3]/ui-view/div/div/div[4]/div/div/div[1]/div/div/div[2]/tm-result-card/div/div[1]/div[2]/div[3]/div[2]/button")).click();
   
   //get URL
   String strUrl = driver.getCurrentUrl();
   System.out.println("Current Url is:"+ strUrl);
   driver.quit();
   
	}
}
   