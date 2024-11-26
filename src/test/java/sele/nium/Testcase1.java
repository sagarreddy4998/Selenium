package sele.nium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	WebDriver driver;
	String url="https://chatgpt.com/";
	@BeforeMethod
	public void setupp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		}
  @Test
  public void f() throws InterruptedException {
	 
	  Thread.sleep(2000);
	  //String Source = driver.getPageSource();
	  //System.out.println(Source);
	  //System.out.println("handle"+driver.getWindowHandles());
	  System.out.println("page title = " +(driver.getTitle()));
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("error:"+e);
		
	}}
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
  
}
