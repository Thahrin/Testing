package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4Task32 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.name("search"));
        search.sendKeys("mobiles");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        WebElement returns =driver.findElement(By.linkText("Returns"));
        returns.click();
        driver.navigate().back();
        WebElement giftcertificate=driver.findElement(By.linkText("Gift Certificates"));
		giftcertificate.click();
		Thread.sleep(3000);
	     
        driver.quit();
	}
}
