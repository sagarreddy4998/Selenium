package sele.nium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownn {
	WebDriver driver;
	String url="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
  @Test(priority=3)
  public void f() throws InterruptedException {
	  WebElement menu = driver.findElement(By.xpath("//select[@id='course']"));
	  Select selectt = new Select(menu);
	  selectt.selectByIndex(2);
	  Thread.sleep(3000);
	  selectt.selectByValue("java");
	  Thread.sleep(3000);
	  selectt.selectByVisibleText("Python");
	  Thread.sleep(3000);
	  List<WebElement> selectoption= selectt.getAllSelectedOptions();
	  for (WebElement webElement : selectoption) {
		  System.out.println(webElement.getText());
		  }}
	 //@Test(priority=2)
	  public void ff() throws InterruptedException {
		 WebElement elmt= driver.findElement(By.xpath("//select[@id='ide']"));
		 Select mulop= new Select(elmt);
		 mulop.selectByIndex(0);
		 Thread.sleep(3000);
		 mulop.selectByValue("ij");
		 Thread.sleep(3000);
		 mulop.selectByVisibleText("Visual Studio");
		 Thread.sleep(3000);
		 List<WebElement> getOp = mulop.getAllSelectedOptions();
		 for (WebElement allOptions : getOp) {
			 System.out.println(allOptions.getText());
		}
		 
		 mulop.deselectAll();
		 Thread.sleep(3000);
		}
	  @Test(priority=0)
	  public void waitss() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.findElement(By.id("Asdxtfgyhu")).click();
	  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
