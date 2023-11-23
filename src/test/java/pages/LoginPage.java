package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By txt_name = By.id("name");
	By txt_password = By.id("password");
	By txt_login = By.id("login");
	
	public void enterUsername(String username) {
		driver.findElement(txt_name).sendKeys(username);
	}
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(txt_login).click();
	}
	
	public void EntervalidCredentials(String username, String password) {
		
		driver.findElement(txt_name).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(txt_login).click();
	}
}
