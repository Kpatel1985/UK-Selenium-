package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	static {System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com");
		Thread.sleep(10000);
		driver.findElement(By.name("origin")).sendKeys("Ban");
		Thread.sleep(1000);
		 List<WebElement> allAutosuggestions = driver.findElements(By.xpath("//a[contains(.,'Ban')]"));
		 Thread.sleep(6000);
		 System.out.println(allAutosuggestions.size());
		 for (int i=0; i<allAutosuggestions.size();i++) {
			 System.out.println(allAutosuggestions.get(i).getText());
		 }
		
		 allAutosuggestions.get(0).click();
		 Thread.sleep(3500);
		 driver.close();
	}

}
