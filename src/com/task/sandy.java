package com.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sandy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\task1\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("twotabsearchtextbox")); 
        user.sendKeys("iphone13");
       
        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
}}
