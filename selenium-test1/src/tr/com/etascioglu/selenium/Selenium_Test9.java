package tr.com.etascioglu.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test9 {

	public static void main(String[] args) throws InterruptedException {
		/*Bu �rnekte al�nan web sitesinin i�erisindeki b�t�n tagleri bir elemente atad�k.
		 * Sonra bu element i�erisinde a taginin i�erisinde olan hrefleri yani linkleri bi listeye atad�m.
		 * Sonra bu listeyi for d�n�g�ne al�p hrefleri ald�k sonra da o hrefdeki urler ara�nda dola��� epias olanlar� yazd�rd�k.
		 * */
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epias.com.tr/");
		WebElement element = driver.findElement(By.xpath(".//*"));
		List <WebElement> liste = element.findElements(By.tagName("a"));
		System.out.println(liste.size());
		for(WebElement webelement : liste)
		{
			String url = webelement.getAttribute("href");
			String urls [] = new String[]{url};
			for(int i=0;i<urls.length;i++){		
				if(urls[i].contains("epias"))
				{	
					System.out.println(urls[i]);				
				}				
			}		
		}
		Thread.sleep(300);
		driver.quit();
	}

}
