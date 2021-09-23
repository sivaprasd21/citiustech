package citius_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page {
	
	
	WebDriver driver;

		@BeforeMethod
		public void login () {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShivaprasadR\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("testFB");
		
			driver.findElement(By.id("pass")).sendKeys("password");
			driver.findElement(By.name("login")).click();
			
	}
		
@AfterMethod
public void logout () {
	driver.quit();
	
}
		
		
}
