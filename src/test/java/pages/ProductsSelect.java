package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class ProductsSelect {

    public ProductsSelect() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@aria-label='128 GB']")
    private WebElement capacity;

    @FindBy(xpath = "//h3[.='Color']")
    private WebElement color;

    @FindBy(xpath = "//input[@aria-label='Black']")
    private WebElement black;

    @FindBy(css = "input[aria-label='Minimum Value in $']")
    private WebElement minPrice;

    @FindBy(css = "input[aria-label='Maximum Value in $']")
    private WebElement maxPrice;

    @FindBy(xpath = "(//div/button)[7]")
    private WebElement okButtonMinMax;

    @FindBy(name = "_sadis")
    private WebElement radius;

    @FindBy(xpath = "(//div/button)[8]")
    private WebElement okButtonRadius;

    @FindBy(css="button[class='s-item__watchheart-click']")
    private WebElement heart;

    @FindBy(linkText = "Watchlist")
    private WebElement linkWatchList;

    @FindBy(linkText = "View all items you are watching")
    private WebElement linkgotoWatchList;

    @FindBy(xpath = "//span[.='All Categories (1)']")
    private WebElement allCategories;

    public void searchBoxSendKey(String brand){
        searchBox.sendKeys(brand+ Keys.ENTER);
    }
    public void capacityclick(){
        ReusableMethods.scrollIntoViewJS(capacity);
        capacity.click();
    }
    public void colorclick(){
        ReusableMethods.hover(color);
        ReusableMethods.scrollIntoViewJS(color);
        color.click();
        black.click();
    }
    public void minMaxPrice(){
        ReusableMethods.scrollIntoViewJS(minPrice);
        minPrice.sendKeys("10");
        maxPrice.sendKeys("2000");
        okButtonMinMax.click();
    }
    public void radiusClick(){
        ReusableMethods.scrollIntoViewJS(radius);
        ReusableMethods.selectByValue(radius,"1000");
        okButtonRadius.click();
    }
    public void firstHeartClick(){
        ReusableMethods.scrollIntoViewJS(heart);
        heart.click();
    }
    public void watchListClick(){
        ReusableMethods.scrollIntoViewJS(linkWatchList);
        ReusableMethods.hover(linkWatchList);
        linkWatchList.click();
        ReusableMethods.hover(linkgotoWatchList);
    }
    public void allCategoriesVerify(){
        Assert.assertTrue(allCategories.isDisplayed());
    }









}
