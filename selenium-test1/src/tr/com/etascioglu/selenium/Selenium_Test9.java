package tr.com.etascioglu.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test9 {

	public static void main(String[] args) throws InterruptedException {
		/*Bu örnekte alýnan web sitesinin içerisindeki bütün tagleri bir elemente atadýk.
		 * Sonra bu element içerisinde a taginin içerisinde olan hrefleri yani linkleri bi listeye atadým.
		 * Sonra bu listeyi for dönügüne alýp hrefleri aldýk sonra da o hrefdeki urler araýnda dolaþýð epias olanlarý yazdýrdýk.
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
