package StepDefinition;

import org.apache.commons.collections4.functors.FalsePredicate;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "D:\\shad\\eclipse\\WebAppDemo-\\feature", 
glue= {"StepDefinition"},
monochrome = true ,
strict = false ,	
dryRun = false ,
tags = {"@smokeTesting"},
plugin = {"jos:target/Cucumber-Report.josn"})

public class TestRuuner {

}

//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
