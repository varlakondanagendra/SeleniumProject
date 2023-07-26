package smartbearproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001_Regestration {
	@Test

	public void regestrationSmartBear() {
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
		signinpage.getRegesterButton().click();
		Assert.assertEquals(driver.getTitle(), "Shop. Register", "Register Page is not Displayed");
		Reporter.log("LogIn Page is Displayed", true);
		
		RegistrationBasePage registrationpage=new RegistrationBasePage(driver);
		registrationpage.getMaleRadioButton().click();
		registrationpage.getFirstTextFiled().sendKeys("Nagendra");
		registrationpage.getLastTextFiled().sendKeys("kumar");
		registrationpage.getDateDropDown().click();
		registrationpage.getDateSelectFromDropDown().click();
		registrationpage.getMonthDropDown().click();
		registrationpage.getMonthSelectFromDropDown().click();
		registrationpage.getYearDropDown().click();
		registrationpage.getYearSelectFromDropDown().click();
		registrationpage.getEmailTextFiled().sendKeys("abcd@gmail.com");
		registrationpage.getUsernameTextFiled().sendKeys("abcdefr");
		registrationpage.getPasswordTextFiled().sendKeys("123485dvhv");
		registrationpage.getConfirmpasswordTextFiled().sendKeys("123485dvhv");
		registrationpage.getCompanyNameTextFiled().sendKeys("abcbrhfgvbkhdsbvi");
		registrationpage.getNewsLetterCheckBox().click();
		registrationpage.getRegisterButton().click();
		
	}

}
