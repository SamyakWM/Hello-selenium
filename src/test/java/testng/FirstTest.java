package testng;

import org.testng.annotations.Test;

import com.test.Library;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstTest {
	
	WebDriver driver;
	
  @Test
  public void myfirstTestcase() {
	  
	  System.out.println("My first test case is running");
	  driver=Library.launchChrome("https://letskodeit.teachable.com/p/practice");
	  driver.findElement(By.id("bmwradio")).click();
	  
	  //driver.findElement(By.id("xyz")).click();
	  
	  new Select(driver.findElement(By.id("carselect"))).selectByIndex(1);
	  
	  new Select(driver.findElement(By.id("multiple-select-example"))).selectByIndex(1);
	  
	  driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]")).click();
	  
	  driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[2]")).click();
  }
	  
 @Test
public void second() {
	  
System.out.println("My second test case is running");
	  
}
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am running before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am running after test");
	  //driver.close();
  }

}
