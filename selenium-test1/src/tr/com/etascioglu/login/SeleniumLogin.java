package tr.com.etascioglu.login;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumLogin extends Utility{
	
	//TODO  stringutills gibi þeylerle geliþtiribilir.
	//FIXME Assert gibi kullanýmlar daha temiz !
	
	WebElement elementid = driver.findElement(By.cssSelector("#email"));
	WebElement elementpw = driver.findElement(By.cssSelector("#password"));
	WebElement elementbtn = driver.findElement(By.cssSelector("#submit-button"));
	
	@Test
	public void idpwisempty() throws InterruptedException{
	
		String inputid = elementid.getAttribute("value"); 
		if(inputid.isEmpty()) { 
			System.out.println("ID IS EMPTY ! ");
		}
		else{
			System.out.println("ID IS FULL ! ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw.isEmpty()) {
			System.out.println("PW IS EMPTY ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("The email is not a valid email address.")){
			System.out.println("ID ALANI BOÞ GÖNDERÝLDÝ HATA GELDÝ  ! ");
			pass();
			
		}
		else{
			System.out.println("E-Mail boþ gönderilmesine raðmen giriþ yapýldý veya benzer ! Hata ! ");
			fail();
		}
	}
	// Kullanýcý Adý Doðru Þifre Boþ
	@Test
	public void idok_pwisempty() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKLÝ KULLANICI ADI GELECEK ") { 
			System.out.println("Kullanýcý Adý Doðru ");
		}
		else{
			System.out.println("Kullanýcý Adý Yanlýþ ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw.isEmpty()) {
			System.out.println("PW IS EMPTY ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("The email is not a valid email address.")){
			System.out.println("ID ALANI BOÞ GÖNDERÝLDÝ HATA GELDÝ  ! ");
			pass();
		}
		else{
			System.out.println("E-Mail boþ gönderilmesine raðmen giriþ yapýldý veya benzer ! Hata ! ");
			fail();
		}
		Thread.sleep(2000);
	}
	// ID doðru pw yanlýþ olacak
	@Test
	public void idok_pwwrong() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKLÝ KULLANICI ADI GELECEK ") { 
			System.out.println("KULLANICI ADI YANLIÞ ");
		}
		else{
			System.out.println("Kullanýcý Adý yanlýþ ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw == " // TO DO Verilen Þifreye Eþit Deðilse!!") {
			System.out.println("PW IS EMPTY ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("The email is not a valid email address.")){
			System.out.println("ID ALANI BOÞ GÖNDERÝLDÝ HATA GELDÝ  ! ");
			pass();
		}
		else{
			System.out.println("E-Mail boþ gönderilmesine raðmen giriþ yapýldý veya benzer ! Hata ! ");
			fail();
		}
		Thread.sleep(2000);
	}
	//Bu metod ile sistem deneemsi tamamlanacak ve giriþ yapýlacak eðer ikiside doðruysa
	@Test
	public void idpwok() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKLÝ KULLANICI ADI GELECEK ") { 
			System.out.println("KULLANICI ADI DOÐRU");
		}
		else{
			System.out.println("Kullanýcý Adý yanlýþ ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw == " // TO DO Verilen Þifreye Eþit Deðilse!!") {
			System.out.println("ÞÝFRE DOÐRU ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("// BURDA GÝRÝÞ YAPMIÞ KULLANICINI ÝSMÝ OLACAK")){
			System.out.println("GÝRÝÞ BAÞARILI ");
			pass();
		}
		else{
			System.out.println("GÝRÝÞ HATALI");
			fail();
		}
		Thread.sleep(2000);
	}
	// Bu class hazýr login class kontrolü olarak ayrýca kullanýlabilir böylece diðer extend edilir ve sorun çözülür.
	// Test
}