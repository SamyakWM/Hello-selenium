package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Automate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.mortgagecalculator.org/";
		WebDriver driver=Library.launchChrome(url);
		
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).sendKeys("10000");
		
		driver.findElement(By.id("downpayment")).sendKeys("15000");
		
		//driver.findElement(By.name("param[action]")).sendKeys("5000");
		
		driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).sendKeys("4.1");
		
		//driver.findElement(By.xpath("(//input[@class='right-cell'])[5]")).sendKeys("22");
		
		WebElement startMonth=driver.findElement(By.name("param[start_month]"));
		Select selectStartMonth=new Select(startMonth);
		selectStartMonth.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.id("start_year"));
		year.sendKeys("2020");
		
		WebElement pTax=driver.findElement(By.id("pptytax"));
		pTax.sendKeys("222");
		
		WebElement homeins=driver.findElement(By.id("hoi"));
		homeins.sendKeys("350");
		
		WebElement loanType=driver.findElement(By.name("param[milserve]"));
		Select selectLoanType=new Select(loanType);
		selectLoanType.selectByIndex(1);
		//selectLoanType.selectByVisible("FHA");
		
		WebElement buy=driver.findElement(By.name("param[refiorbuy]"));
		Select selectBuy=new Select(buy);
		selectBuy.selectByVisibleText("Buy");
		
		WebElement credit_rating=driver.findElement(By.id("credit_rating"));
		Select select_credit_rating=new Select(credit_rating);
		select_credit_rating.selectByIndex(2);
		
		WebElement calcButton=driver.findElement(By.xpath("//input[@name='cal']"));
		calcButton.click();
		

		WebElement monthlyPayment=driver.findElement(By.xpath("//div[@class='repayment-block']//h3"));
		String mPay=monthlyPayment.getText();
		System.out.println("Your monthly payment is: "+mPay);
		
		//Total monthly payment= $71.83

		
		////input[@name='cal']
		
		//div[@class='repayment-block']//h3
		
		
		
		
				
				
	}

}
