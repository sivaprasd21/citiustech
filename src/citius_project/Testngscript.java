package citius_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngscript {

	@Test
	public void launch() {		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@BeforeMethod
	public void beforelaunch() {		
		WebDriverManager.edgedriver().setup();;
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}
	
}
