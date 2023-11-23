package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EDGEgroupPage {

	

	 WebDriver driver;
	
	By EdgeGroup_tab = By.xpath("/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[2]/a/span");

	By TitleHeading = By.className("//h2[@class='titleHeading']");
	By Refresh_btn = By.xpath("//h2[@class='titleHeading']//following::img[@class='mat-tooltip-trigger'][1]");
	
	By Alarm_heading_col = By.xpath("//div[@class='mat-sort-header-content ng-tns-c71-5']");
	
	
	public EDGEgroupPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void chechEdgetab() {
		System.out.println("this is in tab");
	//	driver.findElement(EdgeGroup_tab).isDisplayed();
	}
	
	public void clickOnEdgeGroup() {
		
		boolean tab_appeared =  driver.findElement(EdgeGroup_tab).isDisplayed();
		System.out.println("the condition is  "+tab_appeared);
		driver.findElement(EdgeGroup_tab).click();
	}
	
	public void checkHeading() {
		
		driver.findElement(TitleHeading).isDisplayed();
		
	}
	
	public void checkInternalTab() {
		driver.findElement(Alarm_heading_col).isDisplayed();
		driver.findElement(Refresh_btn).isDisplayed();
	}
	
	
}
