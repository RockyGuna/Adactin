package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium_NovBatch_1\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@role='searchbox'][1]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("Delhi" + Keys.ESCAPE);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.quit();
	}
}
