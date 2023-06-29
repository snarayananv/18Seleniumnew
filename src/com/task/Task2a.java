package com.task;

import java.util.ArrayList;
import java.util.List;

public class Task2a {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		int size = li.size();
		
		System.out.println("First 5 values");
		for (int i = 0; i < size; i++) {

			if (i == 5) {
				
				break;
			
			}
			
		}       
	}       
}