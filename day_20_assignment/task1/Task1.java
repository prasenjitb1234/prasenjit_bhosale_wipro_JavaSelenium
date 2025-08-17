package day_20_assignment.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

//Assignment 1 – Action Class
//Objective: Practice mouse and keyboard interactions.
//Scenario:
//Open the DemoQA site → https://demoqa.com/buttons
//Perform:
//Double Click on “Double Click Me” button.
//Right Click on “Right Click Me” button.
//Single Click on the third “Click Me” button.
//Print the text messages that appear after each click action.
//Extra Challenge:
//Visit https://demoqa.com/dragabble and drag the element from its position to another point.

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/buttons");

		Actions act = new Actions(driver);

		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleClick).perform();
		Thread.sleep(2000);

		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).perform();
		Thread.sleep(2000);

		WebElement singleClick = driver.findElement(By.xpath("//*[@id=\"uQTnU\"]"));
		singleClick.click();
		Thread.sleep(2000);

		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);

		driver.close();
	}
}