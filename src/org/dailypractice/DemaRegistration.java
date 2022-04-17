package org.dailypractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemaRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium_NovBatch_1\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get()->Used to pass the Url as String
		driver.get("https://www.facebook.com/");
		// to maximize the window
		driver.manage().window().maximize();
		// is used to get the title of the application or page
		String title = driver.getTitle();
		System.out.println(title);
		//it will get url of the current page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}
}
