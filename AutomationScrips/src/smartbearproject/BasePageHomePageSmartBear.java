package smartbearproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageHomePageSmartBear {

	public BasePageHomePageSmartBear(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginButton;
	@FindBy(xpath = "(//span[contains(text(),'Gift Cards')])[1]")
	private WebElement GiftCards;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getGiftCards() {
		return GiftCards;
	}

}
