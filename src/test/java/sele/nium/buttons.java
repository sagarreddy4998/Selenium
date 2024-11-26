package sele.nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {
	WebDriver driver;
	String url ="https://www.hyrtutorials.com/p/basic-controls.html";
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(url);	
	}
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("qwert");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("dfghjk");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//input[@id='femalerb']")).click();
	  Thread.sleep(2000);

	  WebElement Eng = driver.findElement(By.xpath("//input[@id='englishchbx']"));
	  Eng.click();
Thread.sleep(2000);
Eng.click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='firstName']")).clear();
	  Thread.sleep(2000);

	  //Select selectfrom = new Select(Eng);
	 }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
