package smartbearproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationBasePage {
	public RegistrationBasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstTextFiled;
	@FindBy(id = "LastName")
	private WebElement lastTextFiled;
	@FindBy(xpath = "//option[text()='Day']")
	private WebElement dateDropDown;
	@FindBy(xpath = "//option[text()='16']")
	private WebElement dateSelectFromDropDown;
	@FindBy(xpath = "//option[text()='Month']")
	private WebElement monthDropDown;
	@FindBy(xpath = "//option[text()='January']")
	private WebElement monthSelectFromDropDown;
	@FindBy(xpath = "//option[text()='Year']")
	private WebElement yearDropDown;
	@FindBy(xpath = "//option[text()='2023']")
	private WebElement yearSelectFromDropDown;
	@FindBy(id = "Email")
	private WebElement EmailTextFiled;
	@FindBy(id = "Username")
	private WebElement usernameTextFiled;
	@FindBy(id = "Password")
	private WebElement passwordTextFiled;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTextFiled;
	@FindBy(id = "Company")
	private WebElement companyNameTextFiled;
	@FindBy(id = "Newsletter")
	private WebElement newsLetterCheckBox;
	@FindBy(name = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstTextFiled() {
		return firstTextFiled;
	}

	public WebElement getLastTextFiled() {
		return lastTextFiled;
	}

	public WebElement getDateDropDown() {
		return dateDropDown;
	}

	public WebElement getDateSelectFromDropDown() {
		return dateSelectFromDropDown;
	}

	public WebElement getMonthDropDown() {
		return monthDropDown;
	}

	public WebElement getMonthSelectFromDropDown() {
		return monthSelectFromDropDown;
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public WebElement getYearSelectFromDropDown() {
		return yearSelectFromDropDown;
	}

	public WebElement getEmailTextFiled() {
		return EmailTextFiled;
	}

	public WebElement getUsernameTextFiled() {
		return usernameTextFiled;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getConfirmpasswordTextFiled() {
		return confirmpasswordTextFiled;
	}

	public WebElement getCompanyNameTextFiled() {
		return companyNameTextFiled;
	}

	public WebElement getNewsLetterCheckBox() {
		return newsLetterCheckBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	@FindBy(xpath = "//li[contains(text(),'The specified email already exists')]")
	private WebElement WrongEmailErrorMessage;
	@FindBy(id = "Email-error")
	private WebElement emptyEmailTextFielderrorMessage;

}
