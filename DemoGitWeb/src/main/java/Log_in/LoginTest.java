package Log_in;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Sign_up.Open_close_appn;

public class LoginTest extends Sign_up.Open_close_appn{
	@Test
	public void test() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("adarshakn24@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.id("loginBtn")).click();


	}

}
