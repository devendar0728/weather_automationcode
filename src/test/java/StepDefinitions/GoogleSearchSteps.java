package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
	 System.out.println("inside given");
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\yDevendar\\src\\test\\resources\\drivers\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}

	@Given("user is on google page")
	public void user_is_on_google_page() throws InterruptedException {
		System.out.println("inside given2");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(6000);
	}

	@When("user enter text")
	public void user_enter_text() throws InterruptedException {
		System.out.println("inside when");
	//	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
	//	Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys("abcd");
		Thread.sleep(5000);
		
	}

	@When("Hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("inside whe2n");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("user is navigated to results page")
	public void user_is_navigated_to_results_page() {
		System.out.println("inside then3");
		driver.getPageSource().contains("People");
		
		driver.close();
		driver.quit();
	}

}
