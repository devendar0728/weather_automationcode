package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.EDGEdevicePage;

public class EdgeDeviceSteps extends BaseTestFile{

	@Before
	public void getScenario(Scenario scenario)
	{
		vTCName = scenario.getName();
	}
	@After
	public void savereport()
	{

		driver.close();
	}

	EDGEdevicePage Edp;


	@Then("Go to the EDGEDevice Tab")
	public void go_to_the_edge_device_tab() {
		Edp = new EDGEdevicePage(driver);
		Edp.clickOnEdgeDevice();
		getScreenshot();
		readproperties("PASSWORD");
		
	}

	@Then("validate the EDGEDevice heading and functions")
	public void validate_the_edge_device_heading_and_functions() {
		Edp.checkInternalDeviceTab();
	}

}
