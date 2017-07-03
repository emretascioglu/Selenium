package tr.com.etascioglu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test7 {

	public static void main(String[] args) throws InterruptedException {
		//Tam bir form doldurlup gönderildi.
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dhgiris.com/Register.aspx");
		driver.manage().window().maximize();
		// Burda id name xpath gibi çaðýrma imkanlarý var.
		WebElement element1 = driver.findElement(By.xpath("//*[@id='loginname']"));
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div/div[9]/input[2]"));
		
		WebElement element3 = driver.findElement(By.name("strEmail"));
		WebElement element4 = driver.findElement(By.name("strEmailAgain"));
		WebElement element5 = driver.findElement(By.name("strPassword"));
		WebElement element6 = driver.findElement(By.name("strPasswordAgain"));
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div/div[10]/input"));
		
		
		element1.sendKeys("ornekkullanici-bu bir testtir");
		Thread.sleep(1000);
		element3.sendKeys("ornek@eposta.com");
		Thread.sleep(1000);
		
	
		
		element4.sendKeys("ornek@eposta.com");
		Thread.sleep(1000);
		element5.sendKeys("orneksifre");
		Thread.sleep(1000);
		element6.sendKeys("orneksifre");
		Thread.sleep(1000);
		element2.click();
		Thread.sleep(1000);		
		
//		if(element2.isSelected()){
//			System.out.print("Selected");
//		}
//		else{
//		 	System.out.print("Not Selected");	
//		}
		
		String txtbosdolu = element3.getAttribute("value");
		if(txtbosdolu.isEmpty()){
			System.out.print("BOÞ");	
		}
		
		else{
			System.out.print("DOLU");
		}
		
		Thread.sleep(3000);
		driver.quit();	
	}
	
}