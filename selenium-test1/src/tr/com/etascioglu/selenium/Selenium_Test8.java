package tr.com.etascioglu.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		/* Bu örnekte array liste verilen urllerin titlelarýný döngü içerisinde alarak yazdýrdýk 
		 * Bu sayade döngü, array ve if-else yapýsý ile URL'leri yazdýrmýþ olduk.*/
		
		String a [] = {"https://www.epias.com.tr/","http://www.guru99.com/selenium-tutorial.html","https://www.google.com.tr/"};
		
		for(int i=0;i<a.length;i++){
			driver.get(a[i]);
			
			if(driver.getTitle()!=null){
				System.out.println(i+1 + " " + a[i] + " " + driver.getTitle());
				System.out.println("");	
			}
			else{
				System.out.print("HÝÇ GELMEDÝ");
			}		
		}
		Thread.sleep(30000);
		driver.quit();
	}
	
}
