package org.dailypractice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Lenova Mobiles" + Keys.ENTER);
		List<WebElement> MobileName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> MobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		Map<String, String> map = new LinkedHashMap<>();
		
		for (int i = 0; i < MobileName.size(); i++) {
			WebElement a = MobileName.get(i);
			WebElement b = MobilePrice.get(i);
			map.put(a.getText(), b.getText());
		}
	 
		for (Map.Entry<String, String> MobileDetails : map.entrySet()) {
			String key = MobileDetails.getKey();
			String value = MobileDetails.getValue();
			System.out.println(key + "\t" + value);
			
		}
	}
}
