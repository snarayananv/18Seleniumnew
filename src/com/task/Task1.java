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
public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Xtreme\\eclipse-workspace\\SeleniumNew\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddCountry = driver.findElement(By.id("country-list"));
		Select s = new Select(ddCountry);
		List<WebElement> countrys = s.getOptions();

		List<String> listValues = new ArrayList<>();
		Set<String> setValues = new LinkedHashSet<>();
		Set<String> setDuplicateValues = new LinkedHashSet<>();
		for (String a : listValues) {
			boolean add = setValues.add(a);
			if (!add) {
				setDuplicateValues.add(a);	
			}		
		}
		System.out.println("Duplicate =" +setDuplicateValues);
	}

}
