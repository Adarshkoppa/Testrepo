package Sign_up;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testsignup extends Open_close_appn{
	//WebDriver driver;
	@Test
	public void reg()
	{
		//driver = new ChromeDriver();
		driver.findElement(By.xpath("//a[text()='Signup']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement we = driver.findElement(By.id("select2-gender-container"));
		Actions act=new Actions(driver);
		act.click();
		driver.findElement(By.xpath("//input[@placeholder='Name' and @type='text']")).sendKeys("Adarsha");
		driver.findElement(By.id("user_type-3")).click();
		driver.findElement(By.id("select2-country-container")).click();
		driver.findElement(By.xpath("//input[@name='phone' and @placeholder='Phone Number']")).sendKeys("7892778115");
		driver.findElement(By.id("email")).sendKeys("adarshakn24@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.id("password_confirmation")).sendKeys("abc12345");
		driver.findElement(By.id("term")).click();
		driver.findElement(By.xpath("//button[text()=' Register ']")).click();
		
		
	}
	

}

