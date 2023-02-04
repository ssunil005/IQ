package com.codeStudio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions0 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/buttons");
	    WebElement ele = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();
		System.out.println("right click--> " + ele.getText());
		
		WebElement dbleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dbleClick).perform();
		System.out.println("double click--> " + dbleClick.getText());
		
		WebElement singleClick = driver.findElement(By.id("oQGDv"));
		action.click(singleClick).perform();
		System.out.println("single click--> " + singleClick.getText());
		
		
	}

}
