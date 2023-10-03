package labMagento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class creatAcount extends prameters {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.get(url);

	}

	@Test()
	public void mytest() {

		WebElement creatbouttun = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
		creatbouttun.click();

		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys(randomFirstName);

		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));

		lastname.sendKeys(randomLastName);

		

		WebElement email = driver.findElement(By.xpath("//input[@id='email_address']"));

		
		email.sendKeys(email_address);
		
		
		
		WebElement pasword = driver.findElement(By.xpath("//input[@id='password']"));

		pasword.sendKeys(paswordnum);
		
		
		WebElement confipasword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));

		confipasword.sendKeys(paswordnum);
		
		
		
		
		WebElement donebouttun = driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]"));
		donebouttun.click();
		
		
		
		
		
		
		
		
		
		
		Check.assertAll();

	}

	@AfterTest
	public void posttest() {
	}

}
