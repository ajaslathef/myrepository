package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Automaton {
	
	
	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		
     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajas\\git\\repository3\\Demosample2\\Driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		

		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();		
		System.out.println("Facebook page is loaded");
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("Amazon is loaded");
		
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Flipkart is loaded");
		
		driver.get("https://www.xilligence.com/");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("xilligence is loaded");
		
		System.out.println("Testing is completed");
		
		
		
		
		
		
		
	}

}
