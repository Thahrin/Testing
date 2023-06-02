package com.example.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task3 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://j2store.net/free/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        List<WebElement> lists=driver.findElements(By.xpath("//h2[@class='product-title']"));
        for (WebElement web : lists)
        {
        	
        	System.out.println(web.getText());
        	
        }
        
        
	}
}
