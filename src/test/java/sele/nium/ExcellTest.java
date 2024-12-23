package sele.nium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcellTest {
	WebDriver driver;
	String url="https://www.instagram.com/";
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
  @Test
  public void mainTest() throws Exception {
	  File excell = new File("C:\\Users\\saikrishnareddy123\\Desktop\\Sagar1123\\nium\\Resources\\LoginData.xlsx");
		//System.out.println(excell.exists());
		FileInputStream FIS = new FileInputStream(excell);
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);
		XSSFSheet sheet	= workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowcount; i++) {
			System.out.println("before Clear");
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		System.out.println("after Clear");
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35']")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		
		try {
		WebElement error=driver.findElement(By.xpath("//div[text()='Sorry, your password was incorrect. Please double-check your password.']"));	
		if(error.isDisplayed()) {
			System.out.println("password wrong");
			driver.navigate().refresh();
		}}
		catch(Exception e) {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		System.out.println("zero");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//span[text()='More']")).click();
		System.out.println("first");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		Thread.sleep(3000);}
  }}
  	@AfterMethod
	public void teardown() {

	  driver.quit();
  }
}
