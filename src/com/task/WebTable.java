package com.task;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Xtreme\\eclipse-workspace\\SeleniumNew\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		WebElement table1 = driver.findElement(By.xpath("(//a[text()='HTML Tables'])[1]"));
		table1.click();

		WebElement table = driver.findElement(By.id("customers"));
		Map<String, Integer> mp = new LinkedHashMap<>();
		int i = 0, j = 0;
		String text2 = "";
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for (i = 0; i < tableRows.size(); i++) {
			WebElement rows = tableRows.get(i);
			String text = rows.getText();
			 System.out.println(text);

			List<WebElement> datas = table.findElements(By.tagName("td"));
			for (j = 0; j < datas.size(); j++) {
				WebElement tableDatas = datas.get(j);
				text2 = text2+tableDatas.getText();
				System.out.println(text2);
			}

		}
		System.out.println(text2);
		if (text2.equals("Mexico")) {
			System.out.println("row no" + (i + 1));
			System.out.println("column no" + (j + 1));

		}

		driver.quit();
	}
}
