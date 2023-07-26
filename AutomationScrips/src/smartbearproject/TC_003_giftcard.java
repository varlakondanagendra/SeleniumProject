package smartbearproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test

public class TC_003_giftcard extends SignInMethod {

	public void gift() {
		WebDriver driver = new ChromeDriver();
		SignInMethod sg = new SignInMethod();
		sg.signInSmartBear();
		
		BasePageHomePageSmartBear basepage = new BasePageHomePageSmartBear(driver);
		basepage.getGiftCards().click();
		Assert.assertEquals(driver.getTitle(), "Shop. Gift cards", "GiftCard Page not Displayed");
		Reporter.log("GiftCard Page is Displayed", true);
		
}
}
