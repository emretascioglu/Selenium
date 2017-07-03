package tr.com.etascioglu.login;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumLogin extends Utility{
	
	//TODO  stringutills gibi �eylerle geli�tiribilir.
	//FIXME Assert gibi kullan�mlar daha temiz !
	
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
			System.out.println("ID ALANI BO� G�NDER�LD� HATA GELD�  ! ");
			pass();
			
		}
		else{
			System.out.println("E-Mail bo� g�nderilmesine ra�men giri� yap�ld� veya benzer ! Hata ! ");
			fail();
		}
	}
	// Kullan�c� Ad� Do�ru �ifre Bo�
	@Test
	public void idok_pwisempty() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKL� KULLANICI ADI GELECEK ") { 
			System.out.println("Kullan�c� Ad� Do�ru ");
		}
		else{
			System.out.println("Kullan�c� Ad� Yanl�� ");
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
			System.out.println("ID ALANI BO� G�NDER�LD� HATA GELD�  ! ");
			pass();
		}
		else{
			System.out.println("E-Mail bo� g�nderilmesine ra�men giri� yap�ld� veya benzer ! Hata ! ");
			fail();
		}
		Thread.sleep(2000);
	}
	// ID do�ru pw yanl�� olacak
	@Test
	public void idok_pwwrong() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKL� KULLANICI ADI GELECEK ") { 
			System.out.println("KULLANICI ADI YANLI� ");
		}
		else{
			System.out.println("Kullan�c� Ad� yanl�� ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw == " // TO DO Verilen �ifreye E�it De�ilse!!") {
			System.out.println("PW IS EMPTY ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("The email is not a valid email address.")){
			System.out.println("ID ALANI BO� G�NDER�LD� HATA GELD�  ! ");
			pass();
		}
		else{
			System.out.println("E-Mail bo� g�nderilmesine ra�men giri� yap�ld� veya benzer ! Hata ! ");
			fail();
		}
		Thread.sleep(2000);
	}
	//Bu metod ile sistem deneemsi tamamlanacak ve giri� yap�lacak e�er ikiside do�ruysa
	@Test
	public void idpwok() throws InterruptedException{
		
		String inputid = elementid.getAttribute("value"); 
		if(inputid == " //TO DO BURAYA GEREKL� KULLANICI ADI GELECEK ") { 
			System.out.println("KULLANICI ADI DO�RU");
		}
		else{
			System.out.println("Kullan�c� Ad� yanl�� ");
		}
		
		String inputpw = elementpw.getAttribute("value");
		if(inputpw == " // TO DO Verilen �ifreye E�it De�ilse!!") {
			System.out.println("��FRE DO�RU ! ");
		}
		else{
			System.out.println("PW IS FULL ! ");
		}	
		elementbtn.submit();	
		
		if(driver.findElement(By.className("message-text")).getText().equals("// BURDA G�R�� YAPMI� KULLANICINI �SM� OLACAK")){
			System.out.println("G�R�� BA�ARILI ");
			pass();
		}
		else{
			System.out.println("G�R�� HATALI");
			fail();
		}
		Thread.sleep(2000);
	}
	// Bu class haz�r login class kontrol� olarak ayr�ca kullan�labilir b�ylece di�er extend edilir ve sorun ��z�l�r.
	// Test
}