package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
driver.findElement(By.name("username")).sendKeys("supriya123");
driver.findElement(By.name("password")).sendKeys("i don't know");
		 WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_acan_aiit_acap_aijb_acas_aj1_')]"));
		 boolean status = loginbutton.isEnabled();
System.out.println(status);
}}
