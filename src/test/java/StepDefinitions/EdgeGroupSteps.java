package StepDefinitions;

import io.cucumber.java.en.*;
import pages.EDGEgroupPage;

public class EdgeGroupSteps extends BaseTestFile{

	EDGEgroupPage Egp;

	@Given("Open the browser")
	public void open_the_browser() {
		launchBrowser("firefox");

	}

	//	@When("provide the URL {string}")
	//	public void provide_the_url(String AppUrl) {
	//		System.out.println("the URL is "+AppUrl);
	//		driver.navigate().to(AppUrl);
	//	}

	@When("tab is avilable")
	public void tab_is_avilable() {
		System.out.println("no tab required");
		
	}

	@Then("Go to the EDGE Tab")
	public void go_to_the_edge_tab() {
		Egp =new EDGEgroupPage(driver);
		Egp.clickOnEdgeGroup();
	}

	@Then("validate the heading and functions")
	public void validate_the_heading_and_functions() {
		Egp =new EDGEgroupPage(driver);
		Egp.checkInternalTab();
	}

}
