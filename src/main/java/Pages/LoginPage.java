package Pages;


import java.io.IOException;
import Support.Xpath;
import Support.ReadProperty;
import Support.SeleniumMethods;

public class LoginPage extends SeleniumMethods{
	
	Xpath xp;
	ReadProperty rp;
	public LoginPage() throws IOException{
	 xp=new Xpath();
	 rp=new ReadProperty();
	}
	
	

	
	public void clickSignIn() throws IOException {
		
		clickElement(xp.Xpath_signin);
	}

	public void LaunchBrowser() throws IOException {
		launchUrl(rp.getProperty("URL"));
		
	}
	


	public void enterCredentials() throws IOException {
		sendKeys(xp.Xpath_username,rp.getProperty("Username"));
		sendKeys(xp.Xpath_password,rp.getProperty("password"));	
		
	}
	

}
