package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	//1. India Qutub minar
	//2. Agra Taj Mahal
	//3. Hyderabad charminar
	@DataProvider(name = "searchDataSet")
	public Object[][] searchDate(){
		Object[][] searchkeyword = new Object[3][2];
		searchkeyword[0][0] = "India";
		searchkeyword[0][1] = "Qutub Minar";
		
		searchkeyword[1][0] = "Agra";
		searchkeyword[1][1] = "Taj Mahal";
		
		searchkeyword[2][0] = "Hyderabad";
		searchkeyword[2][1] = "charminar";
		
		return searchkeyword;
	}
	
	
	@Test(dataProvider = "searchDataSet" )
	public void TestCaseGoogleSearch(String country, String monument)
	{
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		//open url
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		// enter key combination of country and monument
		searchbox.sendKeys(country + " " + monument);
		
		driver.findElement(By.name("btnk")).submit();
		
	}
	
	

}
