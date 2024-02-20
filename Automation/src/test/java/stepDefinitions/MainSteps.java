package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("******************setup the entries in database");
	}
	@Then("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**launch the browser from config variables");
	}
	@Then("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hit the home page url of banking site************************");
	}
	
	
	@Given("User is on NetBankung landing page")
	public void user_is_on_net_bankung_landing_page() {
		System.out.println("User is on NetBankung landing page");
	}

	/*
	 * @When("User login into aplication") public void user_login_into_aplication()
	 * { System.out.println("User was logining on application"); }
	 */
	/*
	 * @When("User login into aplication with {string} and password {string}")
	 * public void user_login_into_aplication_with_and_password(String usename,
	 * String pwt) { // Write code here that turns the phrase above into concrete
	 * actions System.out.println("El nombre del usuario es "+ usename +
	 * " y la clave diligenciada " + pwt); }
	 */
	@When("^User login into aplication with (.+) and password (.+)$")
	public void user_login_into_aplication_with_and_password(String usename, String pwt) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("El nombre del usuario es " + usename + " y la clave diligenciada " + pwt);
	}

	@Given("User is on register page")
	public void user_is_on_register_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on register page");
	}

	@When("User signup into aplication")
	public void user_signup_into_aplication(List<String> data) {
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println("data en posición "+ i +": " + data.get(i) );
		}
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page was displaying");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards was displaying");
	}

}
