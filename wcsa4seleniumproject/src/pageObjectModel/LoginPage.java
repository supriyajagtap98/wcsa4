package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//to avoid staleReferenceExcepation
	
	@FindBy(name="username")private WebElement UsernameTB;
	@FindBy(name="pwd")private WebElement PasswordTB;
	@FindBy(id="loginButton")private WebElement LoginButton;
	@FindBy(id="KeepLoggedInCheckBox")private WebElement LoggedInCheckBox;
	@FindBy(xpath="//a.[.='Actimind Inc.']")private WebElement ActiMindLink;
	@FindBy(id="licenseLink")private WebElement LicenseLink;
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public void setUsernameTB(WebElement usernameTB) {
		UsernameTB = usernameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public void setPasswordTB(WebElement passwordTB) {
		PasswordTB = passwordTB;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}
	public WebElement getLoggedInCheckBox() {
		return LoggedInCheckBox;
	}
	public void setLoggedInCheckBox(WebElement loggedInCheckBox) {
		LoggedInCheckBox = loggedInCheckBox;
	}
	public WebElement getActiMindLink() {
		return ActiMindLink;
	}
	public void setActiMindLink(WebElement actiMindLink) {
		ActiMindLink = actiMindLink;
	}
	
	

}
