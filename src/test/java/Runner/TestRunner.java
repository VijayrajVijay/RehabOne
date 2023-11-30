package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    
@CucumberOptions( tags = "@tag2 ",features = {"C:\\Users\\103370\\eclipse-workspace\\rehabv (1).zip_expanded\\RehabOne_Project\\src\\test\\java\\Feature\\PageValidation.feature"}, glue = {"stepDefinitions"}
                 )
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}

