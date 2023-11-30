package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class PatientChartPage extends SeleniumMethods{
	
	Xpath xp;
	public PatientChartPage(){
	 xp=new Xpath();
	}
	

	public void clickAndValidatePatientChartPage() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientChart);
		clickElement(xp.link_patientChart);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_patientChartLabel);
	}
	

	
	

}
