package Support;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMethods {
	
	public static WebDriver driver;
	
	public void seleniumInit() {
//		ChromeOptions options =new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		
//	driver =new ChromeDriver(options);
		driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
		
	}
	
	public void launchUrl(String url) {
		seleniumInit();
		driver.get(url);
	}
	public void clickElement(String element) {
		driver.findElement(By.xpath(element)).click();
	}
	
	public void sendKeys(String element, String text) {
		driver.findElement(By.xpath(element)).sendKeys(text);
	}
	
	
	public String getUrl() {
		return driver.getCurrentUrl();

	}
	
	
	
	public void HoverOnElement(String element) {
		 Actions action = new Actions(driver); 	
		 action.moveToElement(driver.findElement(By.xpath(element))).build().perform();
	}
	
	public void clickListOfWebElements(String element,int i) {
		
		List<WebElement> elements=driver.findElements(By.xpath(element));
		elements.get(i).click();
	}
	


public void LoopandclickListOfWebElements(String element) throws InterruptedException {
	List<WebElement> elements=driver.findElements(By.xpath(element));
	for(int i=0;i<elements.size();i++) {
		Thread.sleep(2000);
		elements.get(i).click();
		Thread.sleep(2000);
	}	
}
	
	
public List<WebElement> getListOfWebElements(String element) {
		
		List<WebElement> elements=driver.findElements(By.xpath(element));
		return elements;
	}
	
	public void printTextOfElement(String element) {
		 
		System.out.println("\033[0;1m"+driver.findElement(By.xpath(element)).getText());
	}
	
	public void closeBrowser() {
		driver.close();
	}
	


	public void explicitWaitVisible(Duration seconds, String element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));		
	}

	
	public boolean verifyElementDisplay(String element) {
		return driver.findElement(By.xpath(element)).isDisplayed();
		
	}
	
	public void explicitWaitClickable(Duration seconds, String element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element))));		
	}

	
}
