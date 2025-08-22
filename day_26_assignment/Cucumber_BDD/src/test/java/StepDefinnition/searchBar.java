package StepDefinnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchBar {
	WebDriver driver;

	@Given("login user and search button available")
	public void login_user_and_search_button_available() {
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("searchTerm")).click();

	}

	@And("Enter inputs then use keyboard enter key")
	public void enter_inputs_then_use_keyboard_enter_key() {
		driver.findElement(By.id("searchTerm")).sendKeys("Transfer Funds");
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
	}

	@Then("List of output relevant to input")
	public void list_of_output_relevant_to_input() {

	}

}
