package sele.nium;

import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Frames {
	WebDriver driver;
	String url="https://www.hyrtutorials.com/p/frames-practice.html";
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}	 
  @Test
  public void f() throws InterruptedException {
	  driver.switchTo().frame("frm1");
	  System.out.println("switched to frame1");
	  WebElement coursee=driver.findElement(By.xpath("//select[@id='course']"));
	  System.out.println("found element");
	  Select select = new Select(coursee);
	  select.selectByIndex(2);
	  Thread.sleep(3000);
	  driver.switchTo().parentFrame();
	  driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Done");
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}

