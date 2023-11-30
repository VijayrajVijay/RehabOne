package Pages;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;

import Support.Xpath;
import Support.SeleniumMethods;

public class PortalAdminAccessPage extends SeleniumMethods{
	
	Xpath xp;
	public PortalAdminAccessPage(){
	 xp=new Xpath();
	}
	

	public void clickAndValidatePortalAdminAccessPage() throws InterruptedException {
		openSecurity();
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_userCreationPortal);
		clickElement(xp.link_userCreationPortal);
		Thread.sleep(3000);
		openSecurity();
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_roleCreationPortal);
		clickElement(xp.link_roleCreationPortal);
		Thread.sleep(3000);
		openSecurity();
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_rolePermissionPortal);
		clickElement(xp.link_rolePermissionPortal);
		Thread.sleep(3000);
		openSecurity();
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_widgetPermissionPortal);
		clickElement(xp.link_widgetPermissionPortal);
	}
	
	public void openSecurity() throws InterruptedException {
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_adminAccessPortal);
		clickElement(xp.link_adminAccessPortal);
		Thread.sleep(3000);
		explicitWaitVisible(Duration.ofSeconds(10),xp.link_security);
		clickElement(xp.link_security);
	}

	
	

}
