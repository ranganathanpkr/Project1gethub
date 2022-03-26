package org.gethub;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1gethub {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\Employee\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
WebElement googlelang = driver.findElement(By.id("SIvCob"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style','background:pink')",googlelang);	
}
}
