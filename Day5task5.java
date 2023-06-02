package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task5 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.smart-hospital.in/site/login";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).getText();
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText());
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search-btn\"]"));
        Dimension dim=searchBox.getSize();
        System.out.println(dim);
        String color = driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getCssValue("color");
        System.out.println(color);
        driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div/input")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).click();
        
        
        
        
        
        
        
        
	}

}
