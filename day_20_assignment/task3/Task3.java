package day_20_assignment.task3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 3 – Alerts
//Objective: Handle different types of alerts.
//Scenario:
//Open the DemoQA site → https://demoqa.com/alerts
//Perform:
//Click the button to see an alert, accept it.
//Click the “On button click, confirm box will appear” button, dismiss the alert.
//Click the “Prompt Box” button, enter your name, and accept it.
//Capture and print the alert messages before accepting/dismissing.
//Extra Challenge:
//Wait dynamically for the alert that appears after 5 seconds, then accept it.

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// simple alert.
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();

		alert.accept();

		// time Alert
		WebElement timerAlert = driver.findElement(By.id("timerAlertButton"));
		timerAlert.click();
		Thread.sleep(5000);
		Alert alert2 = driver.switchTo().alert();

		alert2.accept();

		// confirm box.
		Thread.sleep(2000);
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();

		alert3.dismiss();

		// prompt box
		Thread.sleep(2000);
		WebElement promptAlert = driver.findElement(By.id("promtButton")); // correct id.
		promptAlert.click();
		Thread.sleep(2000);
		Alert alert4 = driver.switchTo().alert();

		alert4.sendKeys("prasenjit");
		alert4.accept();

		driver.close();
	}
}