package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4Task34 {


	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("sample");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("sample@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("sam");
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("sample ouput");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        
        
        
	}
}
