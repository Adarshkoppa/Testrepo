package Sign_up;
    import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;

	public class Open_close_appn implements values1{
		public WebDriver driver;
	@BeforeMethod              
	public void open()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	}

