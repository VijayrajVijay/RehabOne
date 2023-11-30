package stepDefinitions;

import java.io.IOException;

import Pages.DashboardPage;
import Pages.PortalAdminAccessPage;
import io.cucumber.java.en.Then;


public class PortalAdminAccessSD {

	PortalAdminAccessPage papage;
	
	public PortalAdminAccessSD() throws IOException{
		this.papage=  new PortalAdminAccessPage();
	}

	@Then("validate portal admin access page is displayed")
	public void validate_portal_admin_access_page_is_displayed() throws InterruptedException {
		papage.clickAndValidatePortalAdminAccessPage();
	}
}
