package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import Pages.DepartmentsPortalPage;
import Pages.PatientPortalPage;
import Pages.PortalAdminAccessPage;
import io.cucumber.java.en.Then;


public class PatientPortalSD {

	PatientPortalPage ppPage;
	
	public PatientPortalSD() throws IOException{
		this.ppPage=  new PatientPortalPage();
	}

	@Then("validate patient portal page is displayed")
	public void validate_portal_admin_access_page_is_displayed() throws InterruptedException {
		ppPage.clickAndValidatAdmissionPage();

	}
}
