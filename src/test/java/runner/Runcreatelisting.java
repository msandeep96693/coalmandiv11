package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/resources/Listing/createlisting.feature"},
 				glue = {"DefinitionSteps"},
 				dryRun = false,
// 				dryRun true will not execute
 				monochrome = true,
// 				tags = "@loginwithotp",
 				plugin = { 
 						"html:Reports/AllInOneReport"
 						
// 						"html:target/cucumber-reports/CucumberReport.html",
// 						"html:target/cucumber-reports/CucumberReport.html",
//				        "json:target/cucumber-reports/CucumberReport.json",
//				        "junit:target/cucumber-reports/CucumberReport.junit",
//// 						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
	        	)

public class Runcreatelisting {

	
}
 