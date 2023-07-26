package smartbearproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class SignInMethod {
	
	public void signInSmartBear() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://services.smartbear.com/samples/TestComplete14/smartstore/",
				"Home Page is not Displayed");
		Reporter.log("Home Page is Displayed", true);

		BasePageHomePageSmartBear basepage = new BasePageHomePageSmartBear(driver);
		basepage.getLoginButton().click();
		Assert.assertEquals(driver.getTitle(), "Shop. Login", "Login Page not Displayed");
		Reporter.log("LogIn Page is Displayed", true);
		signinBasePage signinpage = new signinBasePage(driver);
		signinpage.getSignInTextField().sendKeys("nagendra");
		signinpage.getPasswordTextField().sendKeys("123456789");
		signinpage.getRemenberPasswordCheckBox().click();
		signinpage.getLogInButton().click();
	}
}
