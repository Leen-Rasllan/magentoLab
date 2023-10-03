package labMagento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signIn extends prameters {

	
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.get(url);
		WebElement donebouttun = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		donebouttun.click();
	}

	@Test()
	public void mytest() {
		
		
	
WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		
		email.sendKeys(email_address);
		
		
		WebElement pasword = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));

		pasword.sendKeys(paswordnum);
		
	//
		
		
		WebElement donebouttun = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']	"));
		donebouttun.click();
		
		
		
	}
	
	
	
	
	@AfterTest
	public void posttest() {}
	


	
	
	
	
	
}
