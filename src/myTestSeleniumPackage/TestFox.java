package myTestSeleniumPackage;

	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class TestFox {
		
		

	 public static void main (String[] args) throws InterruptedException {
		 
		
	  // Creating a driver object referencing WebDriver interface
	  WebDriver driver;
	  // Setting webdriver.gecko.driver property
	  driver = new FirefoxDriver();
	  // Using get() method to open a webpage
	  driver.manage().window().maximize();
	  
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement wikipediaLoginBtn = driver.findElement(By.xpath("//*[text()='Log in']"));
		wikipediaLoginBtn.click();


		driver.get("https://google.ca");
		
		//Locate elements by ID
		WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		googleSearchBox.click();
		
		googleSearchBox.sendKeys("Hello World");
		
		WebElement googleSearchBtn = driver.findElement(By.xpath("//*[@value='Google Search']"));
		googleSearchBtn.click();
			
		  /*
	driver.get("https://google.ca");
	WebElement googleSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	googleSearch.click();
	googleSearch.sendKeys("Hello, Iryna!");//WebElement googleSearch = driver.findElement(By.xpath("//div[@class='a4bIc']"));
	
	WebElement googleSearchBtn = driver.findElement(By.xpath("//*[text()='Google Search'"));
	googleSearchBtn.click();
	
	
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	
	  
	  //WebElement txtBxUserName = driver.findElement(By.id("user-name"));
	  
	//  txtBxUserName.sendKeys("standard_user");
	  
	//  WebElement txtBxUserPass = driver.findElement(By.id("password"));
	  
	//  txtBxUserPass.sendKeys("secret_sauce");
	  
	//  WebElement btnLogin = driver.findElement(By.id("login-button"));
	  
	 // btnLogin.click();
	
  driver.get("https://www.altexsoft.com/blog/airline-ticketing/");
  WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[2]/div[1]/div/ul/li[1]/a")));
	  
	  WebElement linkCompany = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/div[1]/div/ul/li[1]/a"));
	  
	  linkCompany.click();
	  
	  
	  
  driver.get("https://www.shoptoyota.ca/ontario/en");
	  
	  try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 // driver.findElement(By.className("home_message")).sendKeys("Keys.F5");
	  driver.navigate().refresh();
	  
	  
	  
	  
public void wait(int intervalInMs) {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
driver.get("https://www.shoptoyota.ca/ontario/en");
		// Closing the browser
		
		test.wait(10000);
		driver.get("https://www.google.ca");
		
		test.wait(10000);
		driver.navigate().back();
		
		
		test.wait(10000);
		driver.navigate().forward();
		  

		  
		  
		  
		  
		  	  driver.get("https://www.shoptoyota.ca/ontario/en");
	  // Closing the browser
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.google.ca");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.navigate().back();
				
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.navigate().forward();
		
		
		  
WebElement googleSearchBar = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	googleSearchBar.sendKeys("Hello World!");
	
	try {
		  Thread.sleep(10000);
	} catch (InterruptedException e) {
		//To do auto-generated catch block
			  e.printStackTrace();
		  }
	  googleSearchBox.clear();
	  	 
WebElement shoppingCartBtn = driver.findElement(By.id("shop_widget"));
	shoppingCartBtn.click();
	  
WebElement signBtn = driver.findElement(By.className("signin-button"));
	signBtn.click();
		
WebElement translateLink = driver.findElement(By.linkText("Français"));
	translateLink.click();

WebElement translateLink = driver.findElement(By.partialLinkText("çais"));
	translateLink.click();

WebElement googleSearchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
googleSearchBox.click();

googleSearchBox.sendKeys("xyz");

WebElement cssSelectorSearch = driver.findElement(By.cssSelector("#APjFqb"));
cssSelectorSearch.click();
cssSelectorSearch.sendKeys("xyz");

driver.get("https://www.shoptoyota.ca/ontario/en");
	  // Closing the browser
	  
	  WebElement lblHomeMessage = driver.findElement(By.className("home_message"));
	  String homeMessage = lblHomeMessage.getText();
	  
	  System.out.print(homeMessage);
		*/

	  //driver.quit();
	  
	 }

	}
