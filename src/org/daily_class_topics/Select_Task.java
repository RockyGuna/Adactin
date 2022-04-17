package org.daily_class_topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement sc = driver.findElement(By.id("searchDropdownBox"));
		Select a = new Select(sc);
		List<WebElement> options = a.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
		
	}

}
