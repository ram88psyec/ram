package com.Selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.Keyboard;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement windHand = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(windHand).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String newwindow : windowHandles) {
			driver.switchTo().window(newwindow);
		}
		
		driver.findElement(By.xpath("//*[@id='navbar']/a[4]")).click();
		
	}

}
