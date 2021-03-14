package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P5 {
	static {System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@class='CwaK9']//span[contains(text(),'I agree')]")).click();
		 //Hyper text mark up language
		Thread.sleep(3000);
		//driver.manage().deleteAllCookies();
		 //WebElement cookies = driver.findElement(By.id("u_0_h"));
		//driver.findElement(By.xpath("//span[contains(.,'agree')]")).click();
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("krinal1912@gmail.com");
		 WebElement passwordTextbox = driver.findElement(By.id("pass"));
		 passwordTextbox.sendKeys("jaggu dada");
		 Thread.sleep(3000);
		 driver.findElement(By.name("login")).click();
		
		

	}

}
