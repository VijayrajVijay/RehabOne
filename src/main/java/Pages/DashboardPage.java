package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class DashboardPage extends SeleniumMethods{
	
	Xpath xp;
	public DashboardPage(){
	 xp=new Xpath();
	}
	
	public void clickAndValidateDashBoardPage() throws InterruptedException {
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_dashboard);
		
		Thread.sleep(3000);
		clickElement(xp.link_dashboard);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_dashboardlabel);
		
	}
	
	
	

}
