package Harman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	public static void main(String[] args) {
		// This line invokes chrome and chrome will open(automated launching of chrome)
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement ele = driver.findElement(By.linkText("Form Authentication"));
		ele.click();
		// This line means driver find the element by putting right path(address)
		// find element always return a webelement so we store and create the reference
		// variable
		WebElement usernameTextfield = driver.findElement(By.xpath("//*[@id='username']"));
		usernameTextfield.sendKeys("tomsmith");
		WebElement passwordTextfield = driver.findElement(By.xpath("//*[@id='password']"));
		passwordTextfield.sendKeys("SuperSecretPassword!");
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id='login']/button/i"));
		LoginButton.click();
		WebElement confirmMessage = driver.findElement(By.xpath("//*[@id='flash']"));
		String confirmationText = confirmMessage.getText();

		if (confirmationText.contains("You logged into a secure area!"))
			System.out.println("Login test successful");
		else
			System.out.println("Login failed");
		driver.quit();

	}

}
