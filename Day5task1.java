package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://j2store.net/free/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String Title=driver.getTitle();
        if(Title.equals("Home"))
        {
        	System.out.println("Title Matched");
        	
        }
        else
        	System.out.println("Title didnt Matched");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        String ReTitle=driver.getTitle();
        if(ReTitle.equals("Shop"))
        	System.out.println("Title Shop Matched");
        else
        	System.out.println("Title Shop didnt Matched");
       
	}
}
