package smartbearproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test

public class TC_002_SignIn extends SignInMethod{

	public void create() {
		
		SignInMethod sg = new SignInMethod();
		sg.signInSmartBear();
	}
}


	 
		
	
		//Assert.assertEquals(signinpage.getLoginErrorMessage().getText(), "Login was unsuccessful. Please correct the errors and try again.", "Error Message is not Displayed");
		//Reporter.log("ErrorMessage is Displayed", true);
		
		

