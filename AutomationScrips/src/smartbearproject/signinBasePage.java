package smartbearproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinBasePage {
	public signinBasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement regesterButton;

	@FindBy(id = "UsernameOrEmail")
	private WebElement signInTextField;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(id = "RememberMe")
	private WebElement remenberPasswordCheckBox;
	@FindBy(linkText = "Forgot password?")
	private WebElement forgetPasswordLink;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement logInButton;

	@FindBy(xpath = "//span[contains(text(),'Login was unsuccessful. Please ')]")
	private WebElement loginErrorMessage;

	public WebElement getRegesterButton() {
		return regesterButton;
	}

	public WebElement getLoginErrorMessage() {
		return loginErrorMessage;
	}

	public WebElement getSignInTextField() {
		return signInTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRemenberPasswordCheckBox() {
		return remenberPasswordCheckBox;
	}

	public WebElement getForgetPasswordLink() {
		return forgetPasswordLink;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

}
