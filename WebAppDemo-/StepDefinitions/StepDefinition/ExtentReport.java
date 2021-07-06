package StepDefinition;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.Scenario;
//import cucumber.api.Scenario;


public class ExtentReport {
	private ExtentHtmlReporter extenthtmlreporter ;
	private ExtentReports extentreport ;

	public ExtentReport(String reportLoc) {
		extenthtmlreporter = new ExtentHtmlReporter(new File (reportLoc));
		extentreport= new ExtentReports();
		extentreport.attachReporter(extenthtmlreporter);
	}
	
	
	public void createTest(Scenario scenario, String scereenShotFile) throws IOException {
		if(scenario != null) {
			String TestName = getScenarioTitel(scenario);
			switch (scenario.getStatus()) {
			case PASSED:
				extentreport.createTest(TestName).pass("PASSED");
				break;

			case FAILED:
				extentreport.createTest(TestName).fail("FAILED").addScreenCaptureFromPath(getScreenShotloc(scereenShotFile));

				break;

			default:
				extentreport.createTest(TestName).skip("Skipped");
			}
		}
	}
	public void WriteToReport() {
		if(extentreport != null) {
			extentreport.flush();
		}
	}

private String getScreenShotloc (String location) {
	return "file:///"+location.replaceAll("\\", "//");
	
}
	private String getScenarioTitel(Scenario scenario) {
		return scenario.getName().replaceAll(" ", "");

	}



}
