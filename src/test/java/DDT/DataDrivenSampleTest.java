package DDT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenSampleTest {
	
	@Test(dataProvider = "getTestData",dataProviderClass = dataProvider.class, timeOut = 20000)
	public void Login(CharSequence[] obj) throws InterruptedException {//String email, String password
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(obj[0]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(obj[1]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).isDisplayed());
		Thread.sleep(1000);
		driver.close();
		
	}

}
