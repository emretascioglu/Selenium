package tr.com.etascioglu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test6 {

	public static void main(String[] args) throws InterruptedException {
		// Bu örnektete ayný þekilde ilgili elementin idsine göre font size'ý
		// Ýçindeki deðer verya yapýlacaðý geldi
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dhgiris.com/Register.aspx");
		WebElement element= driver.findElement(By.id("p_pass"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getAttribute("name"));
		Thread.sleep(2000);
		driver.close();
		
	}	

}
