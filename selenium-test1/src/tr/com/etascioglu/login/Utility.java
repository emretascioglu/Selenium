package tr.com.etascioglu.login;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utility {
	
	public static WebDriver driver;
	public static String baseurl="https://stackoverflow.com/users/login";
	// pass - fail sýnýflarý
	public void pass(){
		System.out.println("PASS ! ");
	}
	public void fail(){
		System.out.println("FAÝLED ! ");
	}
	
	// before ve after class bir daha deðiþtirmeye gerek yok önce bunlar çalýþýr
	@BeforeClass
	public static void setUp(){
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(baseurl);
	}
	
	@AfterClass
	public static void setDown() throws InterruptedException{
		Thread.sleep(5500);
		//driver.quit();
	}
}
