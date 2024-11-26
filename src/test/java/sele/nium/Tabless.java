package sele.nium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class Tabless {
	WebDriver driver;
	String url="https://www.hyrtutorials.com/p/add-padding-to-containers.html";
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
  @Test
  public void gg() {
	  WebElement tbl=driver.findElement(By.xpath("//table[@id='contactList']"));
	  List<WebElement> rows = tbl.findElements(By.tagName("tr"));
	  System.out.println(rows.size());
	  for (WebElement row : rows) {
		  List<WebElement>  colmn = row.findElements(By.tagName("td"));
		  for (WebElement col : colmn) {
			  System.out.println(col.getText());
			
		}
		
	}
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
