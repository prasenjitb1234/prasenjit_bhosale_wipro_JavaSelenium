package day_20_assignment.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Assignment 2 – Select Class
//Objective: Work with dropdowns and multi-select options.
//Scenario:
//Open the DemoQA site → https://demoqa.com/select-menu
//Perform:
//Select “Blue” from the old-style dropdown.
//Select multiple options from the multi-select dropdown (e.g., “Green”, “Yellow”, “Black”).
//Verify and print the selected options.
//Extra Challenge:
//Select options using both selectByVisibleText and selectByIndex.

public class Task2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
		oldSelectMenu.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select>option[value=\"1\"]")).click();

		WebElement multipleselect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div"));
		multipleselect.click();
		Thread.sleep(1000);

		WebElement green = driver
				.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]"));
		green.click();
		Thread.sleep(1000);

		multipleselect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div"));
		multipleselect.click();
		Thread.sleep(1000);

		WebElement blue = driver
				.findElement(By.xpath("//div[contains(@class,'css-12jo7m5')]//div[text()='Blue']"));
		blue.click();
		Thread.sleep(1000);

		multipleselect.click();
		WebElement blackOption = driver
				.findElement(By.xpath("//div[contains(@class,'css-12jo7m5')]//div[text()='Black']"));
		blackOption.click();
		Thread.sleep(1000);

		driver.quit();

	}
}