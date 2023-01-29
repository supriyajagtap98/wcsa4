package assignmentonlocator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_and_Inspect_SeleniumDevApp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers.chromedrier.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement trgt = driver.findElement(By.xpath("//a[.='Downloads']"));
		Actions act = new Actions(driver);
         act.moveToElement(trgt);
         Thread.sleep(2000);
         act.contextClick().perform();
         Robot robot = new Robot();
         for(int i=0;i<6;i++)
         {
        	 robot.keyPress(KeyEvent.VK_DOWN);
        	 robot.keyRelease(KeyEvent.VK_DOWN);
        	 Thread.sleep(2000);
        	 
         }
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	

}
