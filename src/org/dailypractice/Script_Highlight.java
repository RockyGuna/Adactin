package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Highlight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rockyguna");
		Thread.sleep(1000);
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')" , email);
	}
}
