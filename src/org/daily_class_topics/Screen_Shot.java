package org.daily_class_topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement sc = driver.findElement(By.id("email"));
		sc.sendKeys("812423");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File pic = screen.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\User\\eclipse-workspace\\Selenium_Task\\ScreenShot\\facebook.png");
		FileUtils.copyFile(pic, path); 
	}

}
