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
		/* Bu örnektete bir sitenin comboboxundan açýlan verileri alarak bir elemente atadýk
		 * daha sonrasýnda bu element içerisinde ki seçenekleri yani optionlarý tek tek gezerek tümünü bir dosyaya yazdýrdýk.
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
