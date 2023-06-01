package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
       
        //fname
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sample");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("web");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("vasu2004");
        js.executeScript("window.scrollBy(0,1500)", "");
        //subscribe
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    }
}
