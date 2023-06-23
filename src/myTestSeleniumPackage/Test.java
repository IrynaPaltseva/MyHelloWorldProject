package myTestSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Test {

 public static void main(String[] args) {
  // Creating a driver object referencing WebDriver interface
  WebDriver driver;
  // Setting webdriver.gecko.driver property
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
  
  
  driver = new ChromeDriver();
  // Using get() method to open a webpage
  
  driver.get("https://google.ca");
  // Closing the browser
 // WebElement googleSearchBar = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//  googleSearchBar.sendKeys("Hello World!");
 
  //WebElement shoppingCartBtn = driver.findElement(By.id("shop_widget"));
//  shoppingCartBtn.click();
  
  //WebElement signBtn = driver.findElement(By.className("signin-button"));
	//signBtn.click();
	
 WebElement translateLink = driver.findElement(By.linkText("Français"));
 translateLink.click();
  
 System.out.println("Iryna");
  // Closing the browser
  //driver.quit();
 }

}