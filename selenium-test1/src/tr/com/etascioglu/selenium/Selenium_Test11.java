package tr.com.etascioglu.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		
		/*Bu �rnekte radio butonlar�n �zerinde dola��p se�ilen bu listenin i�eri�indeki buttonlar�
		 * �nce se�ip se�ilmeyenlerin �zerinde dola��p sonras�nda ise se�ileni konsola yazd�rd�k
		 * */
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");	
		WebElement element = driver.findElement(By.xpath("//*[@id='article-body']/ol[2]/li[3]/div/form"));	
		List<WebElement> liste = element.findElements(By.xpath(".//input"));
		int i= liste.size();
		for (int k=0;k<i;k++)
			{
			
			Thread.sleep(2500);
			liste.get(k).click();			
			if(liste.get(k).isSelected()){
				System.out.println("Se�ili Button : " + liste.get(k).getAttribute("id"));
			}
			else {
				
				
				System.out.println("Se�ili Olmayan Button : " + liste.get(k).getAttribute("id"));
			}
			}	
		Thread.sleep(5000);
		driver.quit();
	}

}
