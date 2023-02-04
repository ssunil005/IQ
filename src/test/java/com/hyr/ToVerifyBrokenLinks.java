package com.hyr;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToVerifyBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://hyrtutorials.com/");

		Thread.sleep(5000);

		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for(WebElement link: links) {
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlconnection = url.openConnection();
		}

		driver.quit();	
	}
}
