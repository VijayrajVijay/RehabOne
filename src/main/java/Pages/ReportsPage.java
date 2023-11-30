package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class ReportsPage extends SeleniumMethods{
	
	Xpath xp;
	public ReportsPage(){
	 xp=new Xpath();
	}
	

	public void clickAndValidateReportsPage() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_reportsPortal);
		clickElement(xp.link_reportsPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_businessOfficePortals);
		clickElement(xp.link_businessOfficePortals);
//		Thread.sleep(3000);
//		explicitWaitVisible(Duration.ofSeconds(10),xp.link_assessementPendingForAdmitPortal);
//		clickElement(xp.link_assessementPendingForAdmitPortal);
//		Thread.sleep(3000);
//		explicitWaitVisible(Duration.ofSeconds(10),xp.link_inquiryByIntake);
//		clickElement(xp.link_inquiryByIntake);
//		Thread.sleep(3000);
//		explicitWaitVisible(Duration.ofSeconds(10),xp.link_InquiryPatientContactLogPortal);
//		clickElement(xp.link_InquiryPatientContactLogPortal);
	}
	

	
	

}
