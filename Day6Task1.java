package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Task1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Thahrin");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("H");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("1232@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123@");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        
        
	}
}
