package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAccessing {

	public static void main(String[] args) {
		// To open the web browser with given link
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium_NovBatch_1\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Searching Aitee Technology via Selenium
		
		driver.findElement(By.name("username")).sendKeys("RockyGuna");
		driver.findElement(By.id("pass")).sendKeys("Lovelyguna" + Keys.TAB); 
		driver.findElement(By.name("submit")).click();

	}

}
