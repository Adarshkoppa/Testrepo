package Sign_up;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsignup extends Open_close_appn{
	//WebDriver driver;
	@Test
	public void reg()
	{
		//driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("ABC");
		driver.findElement(By.id("LastName")).sendKeys("DEF");
		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd12345");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd12345");
		driver.findElement(By.id("register-button")).click();
		
	}
	

}

