import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath { 
	
	public static void main(String[] args) {
		
		
		

		
		System.setProperty("webdriver.chrome.driver", 
		"./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("http://www.zoopla.co.uk");
		
		WebElement Signin= driver.findElement(By.xpath
		("(//*[@class=\'button button--tertiary-dark account-link__text\'])"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].style.border='3px solid red'",
		Signin);
		
		Signin.click();
		
		
		WebElement Email = driver.findElement(By.xpath("(//*[@id='signin_email'])"));
		jse.executeScript("arguments[0].style.border='3px solid red'",Email);
		Email.sendKeys("arif@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("(//*[@id='signin_password'])"));
		jse.executeScript("arguments[0].style.border='3px solid red'",Password);
		Password.sendKeys("smarttech");
		Password.submit();
		
		

	}

}
