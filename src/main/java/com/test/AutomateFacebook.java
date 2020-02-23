package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromeDriver().setup();
		System.setProperty("webdriver.chrome.driver", "/Users/prawesh11/Documents/java_learn/chromedriver");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Navigate to google.com
		driver.get("https://www.facebook.com");
		//Search java inside google page
		String textToSearch="Samyak Moktan";
		
		driver.findElement(By.name("q")).sendKeys(textToSearch+Keys.ENTER);
		
		String result=driver.findElement(By.id("resultStats")).getText();
		
		System.out.println(result);
		
		driver.findElement(By.xpath(".//h3")).click();
		
		Thread.sleep(5000);
		//driver.quit();
		
	}

}
