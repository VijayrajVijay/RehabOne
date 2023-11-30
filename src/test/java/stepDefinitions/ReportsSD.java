package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import Pages.PatientChartPage;
import Pages.ReportsPage;
import io.cucumber.java.en.Then;


public class ReportsSD {

	ReportsPage rp;
	
	public ReportsSD() throws IOException{
		this.rp=  new ReportsPage();
	}

	@Then("validate Reports page is displayed")
	public void validate_reports_page_is_displayed() throws InterruptedException {
		rp.clickAndValidateReportsPage();
	}
}
