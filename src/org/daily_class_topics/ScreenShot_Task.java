package org.daily_class_topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Task {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone SE (Red, 128 GB)']"));
		TakesScreenshot screen = (TakesScreenshot)driver;
		File From = screen.getScreenshotAs(OutputType.FILE);
		File To = new File("C:\\Users\\User\\eclipse-workspace\\Selenium_Task\\ScreenShot\\Flipkart.jpeg");
		FileUtils.copyFile(From,To);
		
	}

}
