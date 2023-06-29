package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Xtreme\\eclipse-workspace\\SeleniumNew\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		WebElement table1 = driver.findElement(By.xpath("(//a[text()='HTML Tables'])[1]"));
		table1.click();
		// driver.navigate().refresh();
		WebElement table = driver
				.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement rows = tableRows.get(i);
			String text = rows.getText();
			System.out.println(text);
//			List<WebElement> headers = rows.findElements(By.tagName("th"));
//			for (int j = 0; j < headers.size(); j++) {
//				WebElement tableHeaders = headers.get(j);
//				String text1 = tableHeaders.getText();
			// System.out.println(text1);
//		List<WebElement> data = table.findElements(By.tagName("td"));
//		for (int k = 0; k < data.size(); k++) {
//			WebElement tableDatas = data.get(k);
//			String text = tableDatas.getText();
//			System.out.println(text);
//					if (text.equals("Francisco Chang")) {
//						//System.out.println(text);
//						System.out.println("Row no = " + (i + 1));
//						System.out.println("Column no = " + (j + 1));
//					
			// System.out.println(text);
//			Map<String,Integer> mp = new LinkedHashMap<>();
//			Integer r = mp.get(rows);
//			mp.put("Alfreds Futterkiste", 2);
//		 System.out.println(mp);

		}
		driver.quit();
	}
}
