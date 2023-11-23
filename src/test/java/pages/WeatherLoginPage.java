package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherLoginPage {

	
	WebDriver driver;
	

	By username_feild = By.xpath("//input[@type='text']");
	By password_feild = By.xpath("//input[@name='password']");
	By Loginbtn = By.xpath("//button[normalize-space()='Login']");

	@FindBy(xpath="//input[@type='text']")
	WebElement username;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginBtn;

	@FindBy(xpath="//*[contains(text(),'Please Enter the Valid User Name and Password')]")
	WebElement errmsg;
	
	@FindBy(xpath="//*[text()='Password is required']")
	WebElement errmsgpassword;
	
	@FindBy(xpath="//*[text()='User Name is required']")
	WebElement errmsgusername;
	
	@FindBy(xpath="//span[@class='far fa-eye-slash showpwd']")
	WebElement showpasswordicon;
	
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	WebElement dashboard;
	
	
	
	public WeatherLoginPage(WebDriver driver) {
		
		this.driver =driver;
	}

	public void enteruserid(String userid)
	{
		driver.findElement(username_feild).clear();
		driver.findElement(username_feild).sendKeys(userid);
	}
	
	public void enterpwd(String pwd)
	{
		driver.findElement(password_feild).clear();
		driver.findElement(password_feild).sendKeys(pwd);
	}


	public void clickLogin() {
		driver.findElement(Loginbtn).click();
		
	}
	

	
}
