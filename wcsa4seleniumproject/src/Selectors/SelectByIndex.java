package Selectors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
driver.get("file:///C:/Users/LENOVO/Desktop/wcsa4/dropdown.html");
WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='menu']"));
Select sel = new Select(dropDownElement);
sel.selectByIndex(2);
	}
	}
	
