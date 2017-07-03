package tr.com.etascioglu.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test1 {

	 public static void main(String[] args) {
	        //Girilen sitenin baþlýðý ile yazýlan baþlýðýn testi
	    	WebDriver driver ;
	    	
	    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	
	    	driver = new FirefoxDriver();
	    	
	        String baseUrl = "http://google.com";
	        String expectedTitle = "Google";
	        String actualTitle = "";
	        
	        driver.get(baseUrl);

	        actualTitle = driver.getTitle();

	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	        // exit the program explicitly
	        System.exit(0);
	    }
}
