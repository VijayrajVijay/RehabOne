package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import Pages.DepartmentsPortalPage;
import Pages.PortalAdminAccessPage;
import io.cucumber.java.en.Then;


public class DepartmentsPortalSD {

	DepartmentsPortalPage depPage;
	
	public DepartmentsPortalSD() throws IOException{
		this.depPage=  new DepartmentsPortalPage();
	}

	@Then("validate departments portal page is displayed")
	public void validate_portal_admin_access_page_is_displayed() throws InterruptedException {
		depPage.clickAndValidatDepartmentseBusinessOfficePage();
		depPage.clickAndValidateMedicalPage();
		depPage.clickAndValidateDiagnosticsAnaLabPage();


	}
}
