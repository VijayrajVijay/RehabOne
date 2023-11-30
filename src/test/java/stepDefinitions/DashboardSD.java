package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import io.cucumber.java.en.Then;


public class DashboardSD {

	DashboardPage dashboardPage;
	
	public DashboardSD() throws IOException{
		this.dashboardPage=  new DashboardPage();
	}

	@Then("validate dashoard page is displayed")
	public void validate_dashoard_page_is_displayed() throws InterruptedException {
		dashboardPage.clickAndValidateDashBoardPage();
	}
}
