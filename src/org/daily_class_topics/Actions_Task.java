package org.daily_class_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\External\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/laptops/pr?sid=6bo,b5g&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_f42ecce3-8c48-4705-8d45-67e3bdf2edf6_2_372UD5BXDFYS_MC.34WHNYFH5V2Y&otracker=hp_rich_navigation_8_2.navigationCard.RICH_NAVIGATION_Electronics~Laptop%2Band%2BDesktop_34WHNYFH5V2Y&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&cid=34WHNYFH5V2Y");
		Actions act = new Actions(driver);
		WebElement elecronics = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(elecronics).build().perform();
		driver.findElement(By.linkText("Realme")).click();;
	}

}
