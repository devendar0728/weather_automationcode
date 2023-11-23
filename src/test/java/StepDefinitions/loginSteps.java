package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	
	@Given("^user is on Login page$")
	public void user_is_on_login_page() {
	System.out.println("insisde the 1st methos");
	}

	@When("user enters ^(.*) and (.*)$")
	public void user_enters_usrname_and_password(String usrname, String password) {
		System.out.println("insisde the 2st methos");
		
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("insisde the 3st methos");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("insisde the 4st methos");
	}

}
