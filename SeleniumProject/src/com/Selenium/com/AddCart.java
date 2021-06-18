package com.Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("ram88psyec@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("muthu@123");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
        driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]")).click();
        driver.findElement(By.name("message")).sendKeys("nice collections");
        driver.findElement(By.xpath("//*[@id='center_column']/form/p/button")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//*[@id='form']/p/button")).click();
        driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
		
        
        }   

}
