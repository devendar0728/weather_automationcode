package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CommonActions.CommonActions;

public class EDGEdevicePage {
	
	private WebDriver driver;

	By EdgeDevice_Tab = By.xpath("/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[3]/a/span");
	
	By EdgeDevice_Heading = By.className("titleHeading");
	By EdgeDevice_col = By.xpath("/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-device/div/div[2]/div/table/thead/tr/th[2]/div/span/div/div[1]");
	By EdgeDevice_refreshbtn = By.xpath("/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-device/div/div[1]/div/img[1]");
	
	
	public EDGEdevicePage(WebDriver driver) {
		
		this.driver = driver;
	}
	

	public void clickOnEdgeDevice() {
		
		boolean tab_appeared =  driver.findElement(EdgeDevice_Tab).isDisplayed();
		System.out.println("the condition is  "+tab_appeared);
		driver.findElement(EdgeDevice_Tab).click();
	
	
	}
	
	public void checkHeadingDevice() {
		
		driver.findElement(EdgeDevice_Heading).isDisplayed();
		
	}
	
	public void checkInternalDeviceTab() {
		driver.findElement(EdgeDevice_col).isDisplayed();
		driver.findElement(EdgeDevice_refreshbtn).isDisplayed();
	}
	
	

}
