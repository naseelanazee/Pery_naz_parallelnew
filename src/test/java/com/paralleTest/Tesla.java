package com.paralleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.percy.selenium.Percy;

public class Tesla {
WebDriver driver;
	
	@Test
	void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        Percy percy = new Percy(driver);
        driver.get("https://www.tesla.com/");
        driver.manage().window().maximize();
        percy.snapshot("Java example");
	}
}
