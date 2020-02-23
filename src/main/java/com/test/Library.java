package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {

		
		public static WebDriver launchChrome(String url) {
			System.setProperty("webdriver.chrome.driver", "/Users/prawesh11/Documents/java_learn/chromedriver");
			WebDriver temp=new ChromeDriver();
			temp.get(url);
			return temp;
		}

}
