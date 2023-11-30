package stepDefinitions;


import java.io.IOException;

import Pages.DashboardPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSD {
	LoginPage loginpage;
	DashboardPage dashboardPage;
	
	public LoginSD() throws IOException{
		this.loginpage= new LoginPage();
		this.dashboardPage=  new DashboardPage();
	}

@Given("I want to launch rehab page")
public void i_want_to_open_rehab_page() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	loginpage.LaunchBrowser();
}

@Then("Enter username and password")
public void enter_username_and_password() throws IOException {

	loginpage.enterCredentials();
}

@Then("clickon sign in button")
public void clickon_sign_in_button() throws IOException {
	loginpage.clickSignIn();
}




}
