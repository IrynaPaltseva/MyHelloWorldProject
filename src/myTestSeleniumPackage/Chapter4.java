package myTestSeleniumPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Chapter4 {
	public static void main (String[] args) throws InterruptedException {
		 
		
		  // Creating a driver object referencing WebDriver interface
		  WebDriver driver;
		  // Setting webdriver.gecko.driver property
		  driver = new FirefoxDriver();
		  // Using get() method to open a webpage
		  
		  driver.get("https://demos.telerik.com/");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		  
		  WebElement search = driver.findElement(By.id("js-tlrk-nav-search-link"));
		  		  
		  search.click();
		  
		  WebElement searchFound = driver.findElement(By.className("TK-Tag-Input")); 
		  
		 searchFound.sendKeys("Types of Test Studio load tests");
		  
		WebElement searchclick = driver.findElement(By.className("TK-Tag-Input-Button"));
		searchclick.click();
		
		WebElement translateLink = driver.findElement(By.partialLinkText("Step-by-Step"));
		translateLink.click();
		
		WebElement trial = driver.findElement(By.cssSelector("a.TK-Button:nth-child(2)"));
		trial.click();
		
		WebElement emailField = driver.findElement(By.id("email"));
 		  
		emailField.sendKeys("irashel3@gmai.com");
		
		WebElement next = driver.findElement(By.xpath("/html/body/app/ng-component/div/loader/div[1]/div/form/div[2]/button"));
		next.click();
		
		
		
		//Select dropdown = new Select(driver.findElement(By.xpath("/html/body/app/ng-component/div/loader/div[1]/div/form/div[2]/button")));
		
		//dropdown.selectByVisibleText("Roadmap");
		
		
		
		
		
}
}

	