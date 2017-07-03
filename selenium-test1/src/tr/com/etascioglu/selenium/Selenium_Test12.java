package tr.com.etascioglu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test12 {

	public static void main(String[] args) {
		// Burda da ul içerisinde ki lileri gösteren findelemntby içinde findelements olacak þekilde.
		// Boþ dönüyor tüm deðerler.
		
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.haberturk.com/");
		int size = driver.findElement(By.xpath("//*[@id='header']/div/div[1]/div[3]/div[1]/ul")).findElements(By.tagName("li")).size();
		for(int i=0; i<size; i++){
		String txt = driver.findElement(By.xpath("//*[@id='header']/div/div[1]/div[3]/div[1]/ul")).findElements(By.tagName("li")).get(i).getText();
			System.out.println(txt);
		}
	}

}
