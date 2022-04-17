package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium_NovBatch_1\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement amazon = driver.findElement(By.name("url"));
		Select a = new Select(amazon);
		a.selectByValue("search-alias=computers");
		amazon.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("HP Laptops");
		amazon.findElement(By.xpath("//input[@type='submit']")).click();

		

	}

}
