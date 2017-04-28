package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		WebDriver driver = new ChromeDriver();
		
		WebElement element = driver.findElement(By.id("UserName"));
		element.clear();
		driver.findElement(By.id("UserName")).clear();
		

	}

}
