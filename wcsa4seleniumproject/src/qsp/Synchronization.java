package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("supriya");
	driver.findElement(By.name("password")).sendKeys("prashant1");
	driver.findElement(By.xpath("//button[.='Log in']"));
	Thread.sleep(2000);
	
	
	

	}

}
