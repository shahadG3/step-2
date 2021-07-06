package StepHooks;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "D:\\shad\\eclipse\\WebAppDemo-\\feature", 
		glue= {"StepDefinition"}, 
		monochrome = true,
		plugin= {"html:target/site/cucumber-pretty","jos:target/Cucumber-Report.josn"},
		tags = {"@Test"}
		

		)
public class HooksRunner extends AbstractTestNGCucumberTests{
	@AfterSuite
public void genaratRep () {
	CucumberReport.GenarateReport();
}
	
}
