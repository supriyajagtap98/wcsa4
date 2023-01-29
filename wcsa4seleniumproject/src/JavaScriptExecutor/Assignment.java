package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsa4/password.html");
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block is excuted");
			
		}
		else
		{
			jse.executeScript("document.getElementById('i1').value='admin'");
			System.out.println("Block is Executed");
			
		}
		
}
}