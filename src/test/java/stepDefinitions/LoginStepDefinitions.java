package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import utilities.ReusableMethods;

public class LoginStepDefinitions {
    Login lg = new Login();

    @Given("Kullanici url gider")
    public void kullaniciUrlGider() {
        ReusableMethods.goToBaseURL();
    }

    @When("Kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        lg.singInClick();
    }

    @And("Kullanici {string} girer ve continue tusuna basar")
    public void kullaniciGirerVeContinueTusunaBasar(String email) {
        lg.emailandContinue(email);
    }

    @And("Kullanici {string} girer ve continue tusuna basarr")
    public void kullaniciGirerVeContinueTusunaBasarr(String password) {
        lg.epasswordlandContinue(password);
    }

    @Then("Kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        lg.loginVerify();
    }

    @Given("Kayitli olmayan {string} ile giris yapamaz")
    public void kayitliOlmayanIleGirisYapamaz(String negativemail) {
        lg.emailandContinue(negativemail);
    }


    @Then("Kullanici login olmadigini dogrular")
    public void kullaniciLoginOlmadiginiDogrular() {
    lg.verifySignInErrorMessage();
    }


}
