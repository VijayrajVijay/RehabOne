package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import Pages.PatientChartPage;
import io.cucumber.java.en.Then;


public class PatientChargeSD {

	PatientChartPage pcp;
	
	public PatientChargeSD() throws IOException{
		this.pcp=  new PatientChartPage();
	}

	@Then("validate patientCharge page is displayed")
	public void validate_patientcharge_page_is_displayed() throws InterruptedException {
		pcp.clickAndValidatePatientChartPage();
	}
}
