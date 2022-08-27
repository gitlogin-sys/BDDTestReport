package TestRun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = {"src/main/java/featuresfiles/PrintGoogle.feature"},
   strict=true,
   // monochrome = true,
   //dryRun=true,
   //path of step definition file
		   plugin = { "pretty", "html:target/cucumber-reports" ,"json:target/cucumber-reports/Cucumber.json"  },
   glue = {"stepDefinition"}
   )





public class TestRunner {
	
	
	
	
	

}
