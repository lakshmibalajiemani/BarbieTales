package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hms {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\System 05\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://192.168.1.168/hms/index.php?login");//
		driver.findElement(By.name("login_type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("login_type")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/div[5]/button")).click();
		driver.findElement(By.xpath("//*[@class='icon-user-md']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@class='validate[required]']")).sendKeys("balaji");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[2]/div/input")).sendKeys("balajiemani30@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[3]/div/input")).sendKeys("balaji@123");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[4]/div/input")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[5]/div/input")).sendKeys("5555555555");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[6]/div/div/select"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[6]/div/div/select"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[6]/div/div/select"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[6]/div/div/select"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[6]/div/div/select")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[7]/div/input")).sendKeys("emani");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_paginate\"]/span/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[4]/a[2]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[1]/div/input")).sendKeys("balaji");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[2]/div/input")).sendKeys("balajiemani");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[3]/div/input")).sendKeys("balaji@123");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[4]/div/input")).sendKeys("8855446622");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[2]/div[5]/div/input")).sendKeys("65465465465465");
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[6]/a[2]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
				
		
		
		
		
	}

}