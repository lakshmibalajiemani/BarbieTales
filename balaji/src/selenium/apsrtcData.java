package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class apsrtcData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\System 05\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/controlgroup/");
		
				/*driver.findElement(By.xpath("//*[@id=\"car-type-button\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]")).click();
				*/
				driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]/span[1]")).click();
				
				WebElement btn =driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[3]/span[1]"));
				if(btn.isSelected())
				{
					btn.click();
				}
				
		driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/button")).click();
		Thread.sleep(3000);


	}

}
