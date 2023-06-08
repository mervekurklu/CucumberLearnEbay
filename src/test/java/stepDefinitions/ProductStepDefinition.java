package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductsSelect;

public class ProductStepDefinition {

    ProductsSelect ps = new ProductsSelect();

    @Given("User types {string} in the searchbox and searches")
    public void userTypesInTheSearchboxAndSearches(String brand) {
        ps.searchBoxSendKey(brand);
    }

    @And("the user selects one hundred and twenty-eight gb from storage capacity in the left tabs")
    public void theUserSelectsOneHundredAndTwentyEightGbFromStorageCapacityInTheLeftTabs() {
        ps.capacityclick();
    }

    @And("User selects color black from left tab")
    public void userSelectsColorBlackFromLeftTab() {
        ps.colorclick();
    }


    @And("User sets the price range from ten dollars to two thousand dollars")
    public void userSetsThePriceRangeFromTenDollarsToTwoThousandDollars() {
        ps.minMaxPrice();
    }

    @And("User selects thousand miles from item location in radius section")
    public void userSelectsThousandMilesFromItemLocationInRadiusSection() {
        ps.radiusClick();
    }

    @And("User adds the first product to the watchlist and leaves")
    public void userAddsTheFirstProductToTheWatchlistAndLeaves() {
        ps.firstHeartClick();
        ps.watchListClick();
    }

    @Then("User confirms that the product is on the watchlist")
    public void userConfirmsThatTheProductIsOnTheWatchlist() {
        ps.allCategoriesVerify();
    }
}
