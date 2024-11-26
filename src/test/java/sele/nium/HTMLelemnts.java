package sele.nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HTMLelemnts {
	WebDriver driver;
	String url = "https://www.instagram.com/";
	@BeforeMethod
	public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			
	}
  @Test
  public void f() throws InterruptedException {
//	  driver.findElement(By.xpath("//input[@name='username']")).clear();
//	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sagarreddy4998");
//	  driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']")).clear();
//driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']")).sendKeys("Veer@4998");
String actualtitle= driver.findElement(By.xpath("//div[text()='Log in']")).getText();
String title = "Log in";
Assert.assertEquals(actualtitle, title);
String size= driver.findElement(By.xpath("//div[text()='Log in']")).getCssValue("font-size");
System.out.println(size);
Thread.sleep(2000);

String pageSource = driver.getPageSource();
Assert.assertTrue(pageSource.contains("Log in"));
System.out.println("Passed");

WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);

// Open the second link in the new window
newWindow.get("https://www.google.com");

Thread.sleep(4000);
	 
	 
  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
