package brainstation;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
 public static void main(String[]arg) throws InterruptedException   {
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\software tetsing tool\\selenium all config file\\chromediver95\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	      String baseURL="https://www.phptravels.net/";
	    driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@class,'text-center tours')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'select2-container form-control hotelsearch locationlisttours')]")).click();
		driver.findElement(By.xpath("//div[starts-with(text(),'Legoland Malaysia Day Pass')]")).click();
		driver.findElement(By.xpath("//div[@id='tourtype_chosen']//a[@class='chosen-single']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Yacht']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//div[@id='airDatepickerRange-hotel']//div[@class='form-icon-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='datepickers-container']/div[8]/div[1]/div[1]/div[2]/div[13]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[contains(@type,'button')][normalize-space()='+']")).click();
		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[contains(@type,'submit')][normalize-space()='Search']")).click();
		
	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();
		
		
		driver.findElement(By.xpath("//a[@id='guesttab']")).click();
		driver.findElement(By.xpath("//span[starts-with(text(),'First Name')]")).sendKeys("hassan");
		driver.findElement(By.xpath("//span[normalize-space()='Last Name']")).sendKeys("ohid");
		driver.findElement(By.xpath("//div[@class='col-md-6 col-12 o2']//span[contains(text(),'Email')]")).sendKeys("hassan.ohid@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).sendKeys("hassan.ohid@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Contact Number']")).sendKeys("01777777777");
		driver.findElement(By.xpath("//span[normalize-space()='Address']")).sendKeys("Street");
		
		driver.findElement(By.xpath("//a[@class='chosen-single']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Bangladesh']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM THIS BOOKING']")).click();
		driver.quit();
		
		
 
		
	}
	
}
