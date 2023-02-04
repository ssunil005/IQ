package com.codeStudio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://myudyogaadhar.org/");
    //  driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement genderDropDown = 	driver.findElement(By.xpath("//select[@id='gender']"));
		Select selectGender = new Select(genderDropDown);
		if(selectGender.isMultiple()) {
			System.out.println("the dropdown is multi select");
		}
		else {
			System.out.println("the dropdown is not multi select");
		}
		List<WebElement> allGenderOption = selectGender.getOptions();
		for(WebElement ele : allGenderOption) {
			
		System.out.println("The options for gender dropdown are--> "+ ele.getText());
		}
		selectGender.selectByIndex(2);
		Thread.sleep(5000);
		selectGender.selectByValue("Male");
		
		Thread.sleep(4000);
		selectGender.selectByVisibleText("Female");
		selectGender.deselectByVisibleText("Female");

		//driver.quit();
	}


}
