package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeReelsScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.switchTo().activeElement().sendKeys("youtube shorts");
	List<WebElement>suggestions = driver.findElements(By.xpath("//div[@class='ytd-searchbox-spt']"));
	for(int i=0;i<suggestions.size();i++)
	{
		  WebElement suggestion=suggestions.get(i);
		 String textOfTheWebElement=suggestion.getText();
		 System.out.println(textOfTheWebElement);
		 
			
}
}
}
