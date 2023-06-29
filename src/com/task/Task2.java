package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddCountry = driver.findElement(By.id("country-list"));
		Select s = new Select(ddCountry);
		List<WebElement> countrys = s.getOptions();
		System.out.println("First 5 Countrys\t");
		for (int i = 0; i < 6; i++) {
			WebElement webElement = countrys.get(i);
			String first = webElement.getText();
			System.out.println(first);
		}
		System.out.println("\nLast 5 Countrys");
		for (int i = countrys.size() - 5; i < countrys.size(); i++) {
			WebElement element = countrys.get(i);
			String last = element.getText();
			System.out.println(last);
		}
		System.out.println("\nMiddle");
		WebElement webElement = countrys.get(countrys.size() / 2);
		String middle = webElement.getText();
		System.out.println(middle);
	}

}
