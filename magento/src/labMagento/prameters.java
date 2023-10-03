package labMagento;

import java.util.Random;

import org.testng.asserts.SoftAssert;

public class prameters {

	static String url = "https://magento.softwaretestingboard.com/";

	static SoftAssert Check = new SoftAssert();

	static String[] fnames = { "kamil", "kaady","Saraa", "sadeen","saamy","sanaa","sleem"};
	static Random first = new Random(); 
	

	 static int randomFirstIndex = first.nextInt(fnames.length);
	 static String randomFirstName = fnames[randomFirstIndex];
 
	static String[] lnames = { "ahmed", "mohammed","badeea", "wadeea","jamil","Abosnaa","sleem"};
	static Random last = new Random();
	
	static int randomLastIndex = last.nextInt(lnames.length);
	static String randomLastName = lnames[randomLastIndex];
	
	
	
	static Random random = new Random();
	static int randomNumber = random.nextInt(30000); // Generate a random number // Generate a random number

	static String email_address = randomLastName + randomFirstName + randomNumber + "@gmail.com";
	static String paswordnum =  randomFirstName +"--23--"+randomLastName + randomNumber ;
	
	
	
	
	//input[@id='firstname']
	//input[@id='lastname']
	//input[@id='email_address']
	//input[@id='password']
	//input[@id='password-confirmation']
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
