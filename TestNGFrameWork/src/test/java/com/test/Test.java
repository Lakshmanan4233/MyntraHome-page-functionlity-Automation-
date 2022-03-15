package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	WebDriver driver;
	
	@BeforeMethod
	private void envirnmentSetUp() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
	}
	
	@org.testng.annotations.Test(description="Verify the lgoo fucntionlity",priority=0)
	private void testCase001() {
		driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")).click();
		Assert.assertEquals(driver.getTitle(),driver.getTitle());
		
	}
	
	@org.testng.annotations.Test(description="Verify the men manu select functionality",priority=1)
	private void testCase002() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[text()='Men'])[1]")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	
	@org.testng.annotations.Test(description="Verify the men menu mouse over functionality",priority=2)
	private void testCase003() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Men'])[1]"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).getText(), "T-Shirts");

	}
	
	@org.testng.annotations.Test(description="Verify the women manu select functionality",priority=3)
	private void testCase004() throws InterruptedException {
	
		driver.findElement(By.xpath("(//a[text()='Women'])[1]")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	@org.testng.annotations.Test(description="Verify the women menu mouse over functionality",priority=4)
	private void testCase005() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Women'])[1]"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[text()='Sarees'])[1]")).getText(), "Sarees");

	}
	
	@org.testng.annotations.Test(description="Verify the Kids manu select functionality",priority=5)
	private void testCase006() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[text()='Kids'])[1]")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	@org.testng.annotations.Test(description="Verify the Kids menu mouse over functionality",priority=6)
	private void testCase007() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Kids'])[1]"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[text()='Activity Toys'])[1]")).getText(), "Activity Toys");

	}
	
	
	@org.testng.annotations.Test(description="Verify the Home & living manu select functionality",priority=7)
	private void testCase008() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	@org.testng.annotations.Test(description="Verify the Home & living menu mouse over functionality",priority=8)
	private void testCase009() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[text()='Bedsheets'])[1]")).getText(), "Bedsheets");

	}
	
	@org.testng.annotations.Test(description="Verify the Beauty manu select functionality",priority=9)
	private void testCase010() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[text()='Beauty'])[1]")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	@org.testng.annotations.Test(description="Verify the Beauty menu mouse over functionality",priority=10)
	private void testCase011() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[text()='Lipstick'])[1]")).getText(), "Lipstick");

	}
	
	@org.testng.annotations.Test(description="Verify the Profile menu mouse over functionality",priority=11)
	private void testCase012() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Profile']"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='login / Signup']")).getText(), "LOGIN / SIGNUP");

	}
	
	@org.testng.annotations.Test(description="Verify the Wishlist manu select functionality",priority=12)
	private void testCase013() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	
	@org.testng.annotations.Test(description="Verify the Bag manu select functionality",priority=13)
	private void testCase014() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		Thread.sleep(4000);

	}
	
	
	@org.testng.annotations.Test(description="Validate the user want to search some product ",priority=14)
	private void testCase015() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watches",Keys.ENTER);
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Watches Collection']")).getText(), "Watches Collection");
		Thread.sleep(4000);

	}
	
	@org.testng.annotations.Test(description="Validate the scroll down and scroll Up  ",priority=15)
	private void testCase016() throws InterruptedException {
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//strong[text()='ONLINE SHOPPING MADE EASY AT MYNTRA']")));
		executor.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")));
	}
	
	
	@AfterMethod
	private void complete() {
		
		driver.quit();

	}
}
