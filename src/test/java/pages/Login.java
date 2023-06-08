package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {


    public Login() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Sign in']")
    private WebElement signInFirst;

    @FindBy(id = "userid")
    private WebElement email;

    @FindBy(id = "signin-continue-btn")
    private WebElement continueButton;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(name = "sgnBt")
    private WebElement signIn;

    @FindBy(xpath = "//b[.='merve']")
    private WebElement personalAccount;

    @FindBy(id = "signin-error-msg")
    private WebElement signInErrorMsg;

    public void singInClick(){
        signInFirst.click();
    }
    public void emailandContinue(String mail){
        email.sendKeys(ConfigReader.getProperty(mail));
        continueButton.click();
    }

    public void epasswordlandContinue(String passwordd){
        password.sendKeys(ConfigReader.getProperty(passwordd));
        signIn.click();
    }

    public void loginVerify(){
        Assert.assertTrue(personalAccount.isDisplayed());
    }

    public void verifySignInErrorMessage(){
        Assert.assertTrue(signInErrorMsg.getText().contains("We ran into a problem. Please try again later."));
    }

}
