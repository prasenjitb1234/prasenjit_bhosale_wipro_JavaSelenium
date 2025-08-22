package StepDefinnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMyTryStep {
	WebDriver driver;

	@Given("zerobank login should open in default browser")
	public void zerobank_login_should_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^click on usernamefield and enter (.*)$")
	public void click_on_usernamefield_and_enter_username2(String username2) {
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(username2);
	}

//	@And("^add (.*)$")
//	public void add_password1(String password2) {
//		driver.findElement(By.id("user_password")).clear();
//		driver.findElement(By.id("user_password")).sendKeys(password2);
//	}

	@And("^clicks on signIn Btn (.*)$")
	public void clicks_on_sign_in_btn_status2(String status) {
		driver.findElement(By.name("submit")).click();
		System.out.println("status : " + status);
	}

	@Then("Login Successfully to Zerobank Homepage")
	public void login_successfully_to_zerobank_homepage() {

	}

}
