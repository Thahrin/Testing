package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Task2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.wpeverest.com/user-registration/guest-registration-form/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Vidya");
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("V");
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("123@");
        driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("7-07-2004");
        driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9800)", "");
        driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("98006532");
        WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]"));
        
        driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("51");
        driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("2 months");
        driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Salesperson");
        driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
        JavascriptExecutor js2= (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,9800)", "");
        driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Shared Room\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Shellfish Allergy\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
        
        
        
        
	}
}
