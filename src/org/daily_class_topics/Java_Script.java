package org.daily_class_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		JavascriptExecutor java = (JavascriptExecutor)driver;
//		java.executeScript("confirm('Welcome to Selenium')");
		java.executeScript("window.scroll(0,1000)");
		Thread.sleep(2000);
		java.executeScript("window.scroll(0,-1000)");
		Thread.sleep(2000);
		java.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.xpath("//p[@class='index-lcHeader']"));
		java.executeScript("arguments[0].scrollIntoView(true);", address);
		
	}

}
