package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//public static WebDriver driver;	
	
@FindBy(xpath="//div[@class='f7 mw3 mw4-hdkp lh-title truncate']")
WebElement SignIn;

@FindBy(xpath="//button[@class='w_hhLG w_8nsR w_0_LY db mb3 w-100']")
WebElement SignInButton;

@FindBy(xpath="//input[@type='email']")
WebElement EmailId;

@FindBy(xpath="//input[@id='react-aria-1']")
WebElement passwordButton;

@FindBy(xpath="//button[@type='submit']")
WebElement sumbitButton;

public LoginPage(WebDriver driver) {
	//this.driver=driver;	
	PageFactory.initElements(driver, this);
	
}	

public void signInKaro(){
	
	if(SignIn.isEnabled()){
		SignIn.click();
	}
}
public void SignInbuttonClickKaro() {
	
	if(SignInButton.isEnabled()) {
		SignInButton.click();
	}
}
public void EmailIdTypeKaro(String Emailid) {
	EmailId.sendKeys(Emailid);
}

public void password (String Pass){
	passwordButton.sendKeys(Pass);
 }

public void submit() {
	sumbitButton.click();
}
}

