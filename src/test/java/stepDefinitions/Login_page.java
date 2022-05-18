package stepDefinitions;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login_page {

	
WebDriver driver;

	
	

	@Given("The User is on the Login Page of Flipkart application")
	public void goto_Loginpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@When ("The User login to the application using {string} and {string} and click login button")
	public void user_Login_to_Application_Using_Username_Password(String string1, String string2) {
		WebElement mobile=driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		if(mobile.isDisplayed()) {
			mobile.sendKeys(string1);
		}
		WebElement pwd=driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
		if(pwd.isDisplayed()) {
			pwd.sendKeys(string2,Keys.ENTER);
		}
		
	}
	@Then("Home page is populated")
	public void checking_Home_page_Element(){
		WebElement search=driver.findElement(By.xpath("//*[@name='q']"));
		if(search.isDisplayed()) {
			System.out.println("Home page search elelment is displayed");
			search.sendKeys("Realme 3pro");
		}
	}
	
    }
