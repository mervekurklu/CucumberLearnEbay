package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ProductsSize;

public class ProductAppleStepDefinitions {

    ProductsSize apple = new ProductsSize();

    @Given("User comes to Electronics")
    public void userComesToElectronics() {
        apple.moveToElement();
    }

    @And("The user clicks Apple in the pop-up window")
    public void theUserClicksAppleInThePopUpWindow() {
        apple.moveToElementApple();
    }

    @And("The user clicks on the Apple phones and smartphones tab from the left tab")
    public void theUserClicksOnTheApplePhonesAndSmartphonesTabFromTheLeftTab() {
        apple.cellPhoneClick();
    }

    @And("The user clicks on the iphone fourteen promax by swiping the upper part to the right")
    public void theUserClicksOnTheIphoneFourteenPromaxBySwipingTheUpperPartToTheRight() {
        apple.slideClick();
        apple.proMaxClick();
    }

    @And("Clicks one tb in the Filtering section")
    public void clicksOneTbInTheFilteringSection() {
        apple.tbClick();
    }

    @And("Clicks purple as color")
    public void clicksPurpleAsColor() {
        apple.purpleIphoneClick();
    }

    @When("User verifies that the number in the result is the same as the number of output products")
    public void userVerifiesThatTheNumberInTheResultIsTheSameAsTheNumberOfOutputProducts() {
        apple.resultVerifyProducts();
    }
}
