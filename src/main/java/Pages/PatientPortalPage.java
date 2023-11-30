package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class PatientPortalPage extends SeleniumMethods{
	
	Xpath xp;
	public PatientPortalPage(){
	 xp=new Xpath();
	}
	

	public void clickAndValidatAdmissionPage() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientPortal);
		clickElement(xp.link_patientPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_admissionPortal);
		clickElement(xp.link_admissionPortal);		Thread.sleep(6000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_inquiryPortal);
		clickElement(xp.link_inquiryPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_admissionPortal);
		clickElement(xp.link_admissionPortal);		Thread.sleep(6000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_assessementcalendarPortal);
		clickElement(xp.link_assessementcalendarPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientPortal);
		clickElement(xp.link_patientPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_admissionPortal);
		clickElement(xp.link_admissionPortal);		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_admission2Portal);
		clickElement(xp.link_admission2Portal);
	Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientReleasePortal);
		clickElement(xp.link_patientReleasePortal);
		
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
