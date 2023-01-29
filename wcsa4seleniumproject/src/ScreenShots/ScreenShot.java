package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 EventFiringWebDriver eft = new EventFiringWebDriver(driver);
		 eft.get("https://www.selenium.dev/downloads/");
		 File src = eft.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshot/s04.png");
		 Files.copy(src, dest);
		 
		 eft.close();
	}
		 
		 
		
		
	}

