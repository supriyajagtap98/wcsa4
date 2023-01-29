package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartLaptopAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='x']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("HP Laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//.div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
		driver.findElement(By.xpath("//div['HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		driver.findElement(By.xpath("//div[.=4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
		driver.findElement(By.xpath("//div['Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
	Thread.sleep(2000);
	System.out.println();
		
	}
} 
