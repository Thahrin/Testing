package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4task2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/index.php?route=account/login&language=en-gb";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("demo@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234@");
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
        
	}
}
