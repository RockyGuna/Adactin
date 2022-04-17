package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();
		driver.findElement(By.id("email")).sendKeys("rockyguna@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Append" + Keys.TAB); 
		
	}

}
