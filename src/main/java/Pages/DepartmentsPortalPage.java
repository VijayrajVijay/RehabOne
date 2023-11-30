package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class DepartmentsPortalPage extends SeleniumMethods{
	
	Xpath xp;
	public DepartmentsPortalPage(){
	 xp=new Xpath();
	}
	

	public void clickAndValidatDepartmentseBusinessOfficePage() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_departmentsPortal);
		clickElement(xp.link_departmentsPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_businessOfficePortal);
		clickElement(xp.link_businessOfficePortal);		Thread.sleep(6000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_benefitsVerificationPortal);
		clickElement(xp.link_benefitsVerificationPortal);
		Thread.sleep(5000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientStatementPortal);
		clickElement(xp.link_patientStatementPortal);
		Thread.sleep(8000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_financialStatementPortal);
		clickElement(xp.link_financialStatementPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_paymentPlanPortal);
		clickElement(xp.link_paymentPlanPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_admissionResultsPortal);
		clickElement(xp.link_admissionResultsPortal);
	}
	
	public void clickAndValidateMedicalPage() throws InterruptedException {
		openDepartmentsMedical();	
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_PACPortal);
		clickElement(xp.link_PACPortal);
		openDepartmentsMedical();	
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_labResultsPortal);
		clickElement(xp.link_labResultsPortal);
		openDepartmentsMedical();	
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_mdSchedulePortal);
		clickElement(xp.link_mdSchedulePortal);
	}
	public void clickAndValidateDiagnosticsAnaLabPage() throws InterruptedException {
		openDepartmentsDiagnostics();	
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_NeuroCogPortal);
		clickElement(xp.link_NeuroCogPortal);

	}
	


	public void openDepartmentsMedical() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_departmentsPortal);
		clickElement(xp.link_departmentsPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_medicalPortal);
		clickElement(xp.link_medicalPortal);
	}
	
	public void openDepartmentsDiagnostics() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_departmentsPortal);
		clickElement(xp.link_departmentsPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_diagnosticsPortal);
		clickElement(xp.link_diagnosticsPortal);
	}
}
