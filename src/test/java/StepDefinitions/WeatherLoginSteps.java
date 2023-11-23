package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.WeatherLoginPage;

public class WeatherLoginSteps extends BaseTestFile{

  
	WeatherLoginPage Wlp;


	@Given("Launch_the_browser")
	public void launch_the_browser() throws IOException {

		//readproperties();
		launchBrowser("firefox");
	}

	@When("provide the URL {string}")
	public void provide_the_url(String AppUrl) {
		System.out.println("the URL is "+AppUrl);
		driver.navigate().to(AppUrl);
	}
	@When("provide user and password and click on login button")
	public void provide_user_and_password_and_click_on_login_button() throws InterruptedException {
	   
		System.out.println("Here are parametrized credentials ");
		Wlp = new WeatherLoginPage(driver);
	
		
		Wlp.enteruserid("devendar.malothu@birlasoft.com");
		Wlp.enterpwd("AutoTest@123");
	
		Thread.sleep(5000);
		Wlp.clickLogin();
		
		Thread.sleep(15000);
	}





	@Then("Validate the page after Login")
	public void validate_the_page_after_login() throws InterruptedException {

		System.out.println("the page title is "+driver.getCurrentUrl() );
		Thread.sleep(5000);
	}
}
