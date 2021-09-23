package citius_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\ShivaprasadR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.ndtv.com/business");
driver.switchTo().frame(1);
WebElement val = driver.findElement(By.xpath("//select[@id='type']"));
Select s=new Select(val);
List<WebElement> op = s.getOptions();
System.out.println(op);
s.selectByValue("Site");
/*
 * //driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
 * //driver.get("https://twitter.com/login");
 * driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
 * //driver.findElement(By.className("form-control")).sendKeys("hi");
 * //driver.findElement(By.xpath("(//*[@name='session[username_or_email]'])[1]")
 * ).sendKeys("Hello");
 * //driver.findElement(By.xpath("(//input[@name='session[password]'])[1]")).
 * sendKeys("Imfine");
 * driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
 * "Hello");
 * driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
 * "123");
 * driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).
 * sendKeys("Hello@gmail.com");
 * driver.findElement(By.xpath("//input[@placeholder='(845)555-1212']")).
 * sendKeys("1234");
 * driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys(
 * "Benagaluru");
 * driver.findElement(By.xpath("//input[@placeholder='city']")).sendKeys(
 * "Bengaluru");
 * driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")
 * ).sendKeys("Hello how are you"); WebElement dp =
 * driver.findElement(By.xpath("//select[@name='state']"));
 */









	}

}
