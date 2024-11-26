package sele.nium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class TestNG {
	ChromeDriver driver = new ChromeDriver();
    
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void testng() {
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("error:"+e.getMessage());
		}
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("error:"+e.getMessage());
		}
		}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
