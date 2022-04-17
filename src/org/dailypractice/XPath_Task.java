package org.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class XPath_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
//		driver.findElement(By.xpath("(//ul[@id='java_technologies'])[1]//child::li"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@id='java_technologies'])[1]//child::li[4]")).click();
	}

}
