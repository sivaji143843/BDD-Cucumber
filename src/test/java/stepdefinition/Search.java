package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Search {
	
	WebDriver driver;
	
	@Given("I am on the DemoWebShop Login Page")
	public void i_am_on_the_demo_web_shop_login_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");


	}

	@When("I click on Login Button")
	public void i_click_on_login_button() {

		   driver.findElement(By.linkText("Log in")).click();

	}

	@When("I type Username")
	public void i_type_username() {

		driver.findElement(By.id("Email")).sendKeys("Dumalks@gmail.com");
	}

	@When("I type Password")
	public void i_type_password() {
	
		driver.findElement(By.id("Password")).sendKeys("123456");
		
	}

	@When("I click Login Button")
	public void I_click_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	}
	
	@And("I click on Books")
	public void I_click_on_Books() {

		   driver.findElement(By.linkText("Books")).click();

	}



}
