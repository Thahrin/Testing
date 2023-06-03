package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://jqueryui.com/droppable/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        Actions  ac=new Actions(driver);
        ac.clickAndHold(drag).release(drop).build().perform();
        Thread.sleep(5000);
	}
}
