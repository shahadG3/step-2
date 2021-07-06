package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user on login page")
	public void user_on_login_page() {
		System.out.println("Inside step --> user on login page. ");
	}

	

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside step --> user enter username and password.");

	}



	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Inside step --> Click on login button. ");

	}



	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Inside step --> user is on home page.");

	}


}
