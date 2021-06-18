package com.Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("ram88psyec@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("ram");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		driver.findElement(By.id("passwd")).sendKeys("muthu@123");
		
		WebElement singleDropdown = driver.findElement(By.id("days"));
		Select sel=new Select(singleDropdown);
		sel.selectByValue("29");
		
		WebElement singleDropdown1 = driver.findElement(By.id("months"));
		Select sel1=new Select(singleDropdown1);
		sel1.selectByValue("2");
		
		WebElement singleDropdown2 = driver.findElement(By.id("years"));
		Select sel2=new Select(singleDropdown2);
		sel2.selectByValue("1988");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("firstname")).sendKeys("ram");
		driver.findElement(By.id("lastname")).sendKeys("kumar");
		driver.findElement(By.id("company")).sendKeys("green tech");
		driver.findElement(By.id("address1")).sendKeys("alagiri street");
		driver.findElement(By.id("address2")).sendKeys("vadapalani");
		driver.findElement(By.id("city")).sendKeys("chennai");
		
		WebElement singleDropdown3 = driver.findElement(By.id("id_state"));
		Select sel3=new Select(singleDropdown3);
		sel3.selectByValue("32");
		
		driver.findElement(By.id("postcode")).sendKeys("60002");
		
		WebElement singleDropdown4 = driver.findElement(By.id("id_country"));
		Select sel4=new Select(singleDropdown4);
		sel4.selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("hai");
		driver.findElement(By.id("phone")).sendKeys("257469");
		driver.findElement(By.id("phone_mobile")).sendKeys("9894935163");
		driver.findElement(By.id("alias")).sendKeys("lvk street");
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
		
		
		
		
		
		
		
		
		
	}

}
