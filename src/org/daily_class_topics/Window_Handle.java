package org.daily_class_topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenova Mobiles" + Keys.ENTER);
		WebElement window = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		window.click();
		Set<String> child = driver.getWindowHandles();
		for (String string : child) {
			if(!parent.equals(string)) {
				driver.switchTo().window(string);
				driver.findElement(By.id("add-to-cart-button")).click();
			}
		}
	}
}
