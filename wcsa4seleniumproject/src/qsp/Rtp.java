package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp {
	public static void main(String[] args)throws InterruptedException {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("which brower u want to open!!");
			String browserValue=sc.next();
			
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.close();
	}
	else {
		System.out.println("enter the valid browser name");
		
		
		
	}
		}
		
	}

}
