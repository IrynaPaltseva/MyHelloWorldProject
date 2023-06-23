package myTestSeleniumPackage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HelloWorldTestNG {
	WebDriver driver;
@BeforeSuite
	
	public void preRequsits() {
		
		driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}

	@Test(testName = "TC-0001: Checking hello world",enabled  = false)
	public void sampleTest() {
		System.out.print("Hello World Test NG!");
	}
	
	@Test(enabled = false)
	public void sampleTest2() {
		System.out.println(5/0);
	}
	
	
	
	@Test (priority = 1)
	public void hardAssertionExample() {
		//WebDriver driver;		
		//driver = new FirefoxDriver();
		
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locate elements by ID
		WebElement welcomeLbl = driver.findElement(By.id("From_today's_featured_article"));
		String welcomeText = welcomeLbl.getText();
		
		//Hard Assertion
		Assert.assertEquals(welcomeText,"Dan" );
		//In_the_news
		
		WebElement welcomeLbl2 = driver.findElement(By.id("In_the_news"));
		String welcomeText2 = welcomeLbl2.getText();
		//Hard Assertion
		Assert.assertEquals(welcomeText2,"abc" );
		
		
	}
	
	@Test (priority = 2)
	public void softAssertionExample() {
		//WebDriver driver;		
		//driver = new FirefoxDriver();
		
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		SoftAssert softAssert = new SoftAssert();
		
		//Locate elements by ID
		WebElement welcomeLbl = driver.findElement(By.id("From_today's_featured_article"));
		String welcomeText = welcomeLbl.getText();
		
		//Hard Assertion
		softAssert.assertEquals(welcomeText,"Dan" );
		//In_the_news
		
		
		WebElement welcomeLbl2 = driver.findElement(By.id("In_the_news"));
		String welcomeText2 = welcomeLbl2.getText();
		
		softAssert.assertEquals(welcomeText2,"In the n" );
		//System.out.println("Passed!");
		
		softAssert.assertAll();
		
		
	}
	@AfterClass
	public void afterMethod() {
		driver.quit();
		System.out.println("-----------The End");
	}
	
	}

