package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://j2store.net/free/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String Url=driver.getCurrentUrl();
        if(Url.equals("https://j2store.net/free/"))
        {
        	System.out.println("Url Matched");
        	
        }
        else
        	System.out.println("Url didnt Matched");
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,9000)", "");
       driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
       String SubUrl=driver.getCurrentUrl();
       if(SubUrl.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
       {
       	System.out.println("Url Matched");
       	
       }
       else
       	System.out.println("Url didnt Matched");
        
        
	}
}
