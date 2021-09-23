package citius_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webmanager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("92.0.4515.107").setup();
	//WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShivaprasadR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//WebDriver driver1 =new FirefoxDriver();
//driver1.get("https://www.google.com");
//WebDriver driver =new EdgeDriver();
//		driver.get("https://www.google.com");
		
	}

}
