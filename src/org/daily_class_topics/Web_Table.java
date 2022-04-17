package org.daily_class_topics;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {


		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/table.html");
			
			List<WebElement> header = driver.findElements(By.tagName("th"));
			List<WebElement> row = driver.findElements(By.tagName("tr"));
			for (int i = 0; i < row.size(); i++) {
				List<WebElement> cell = row.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < cell.size(); j++) {
					// System.out.println(cell.get(j).getText());
					if (header.get(j).getText().equals("Mentor Name") && cell.get(j).getText().equals("Babu")) {
                       driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
					}
				}
			}
		}
    }
