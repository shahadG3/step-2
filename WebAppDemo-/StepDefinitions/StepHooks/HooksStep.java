package StepHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

import com.mongodb.connection.Server;

import StepDefinition.ExtentReport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStep {

	WebDriver driver = null;
	private DriverService services ; 
	private static ExtentReport extentReport;
	private static boolean isReporterRunning; 

	@Before
	public void BrowserSetUp() {
		System.out.println("Inside step --> BrowserSetUp() .");
		System.setProperty("webdriver.chrome.deiver", "C:\\webDriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.swiggy.com" );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Before
	public void BeforeScenario(Scenario scenario) {
		if(! isReporterRunning) {
			extentReport = new ExtentReport("D:\\data\\log\\TestReport.html");
			isReporterRunning=true;

		}
	}


	@After
	public void AfterScenario(Scenario scenario) {
		String screenShString= "D:\\data\\log\\" + scenario.getName().replaceAll(" " ,"")+".jpeg";
		if(scenario.isFailed()) {
			services.getGenericHelper().takeScreenShot(ScreenShotFileName);

		}
		extentReport.createTest(scenario, ScreenShotFileName);
		extentReport.WriteToReport();
		if(driver !=null) {
			driver.quit();
		}
	}

	@After 
	public void tearDown() {

		driver.close();
		driver.quit();
	}


	@Given("user on login page")
	public void user_on_login_page() {
		System.out.println("Inside step --> user on login page. ");
	}



	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside step --> user enter username and password.");

	}



	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Inside step --> Click on login button.");

	}



	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Inside step --> user is on home page.");



	}


}
