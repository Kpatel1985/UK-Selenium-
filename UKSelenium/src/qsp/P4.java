package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	static {System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("krinal1912@gmail.com");
		 Thread.sleep(3000);
		 WebElement passwordTextbox = driver.findElement(By.id("pass"));
		 passwordTextbox.sendKeys("jaggu dada");
		 
		

	}

}
