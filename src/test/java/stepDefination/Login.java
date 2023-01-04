package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{


	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
    System.out.println("login button");
	}

	@When("usr enters username and password")
	public void usr_enters_username_and_password() 
	{
	System.out.println("user enter");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
    System.out.println("login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
    System.out.println("User is navigated");
	}

}
