package tr.com.etascioglu.selenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		/* Bu �rnektete bir sitenin comboboxundan a��lan verileri alarak bir elemente atad�k
		 * daha sonras�nda bu element i�erisinde ki se�enekleri yani optionlar� tek tek gezerek t�m�n� bir dosyaya yazd�rd�k.
		 * 
		 */
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		FileWriter fwriter = new FileWriter("results.txt");
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.turkishairlines.com/tr-tr/");
		driver.findElement(By.xpath("//*[@id='Main-Quick-Search-Ticket']/div[3]/div[2]/div[1]/span[1]")).click();
		WebElement element = driver.findElement(By.id("ctlCity"));
		List<WebElement> liste = element.findElements(By.xpath(".//option"));
		for(WebElement w: liste){
			String aname = w.getText();
			bwriter.write(aname);
			bwriter.write("\n");
			bwriter.newLine();
			System.out.println(aname);
		}
		bwriter.close();
		driver.quit();
		
	}
}
