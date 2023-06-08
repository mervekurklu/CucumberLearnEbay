package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class ProductsSize {

    public ProductsSize() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[.='Electronics'])[2]")
    private WebElement electronics;

    @FindBy(xpath = "//a[.='Apple']")
    private WebElement apple;

    @FindBy(linkText = "Apple Cell Phones & Smartphones")
    private WebElement linkCellphonesSmartphones;

    @FindBy(xpath = "(//div/button)[9]")
    private WebElement rightSlide;

    @FindBy(linkText = "Apple iPhone 14 Pro Max")
    private WebElement iphoneproMax;

    @FindBy(xpath = "(//li/a)[72]")
    private WebElement tbButton;   // (//p[@class='b-guidancecard__title'])[4]

    @FindBy(xpath = "(//li/a)[73]")
    private WebElement purpleColor;

    @FindBy(xpath = "(//div/h2)[3]")
    private WebElement results;

    @FindBy(xpath = "//a/h3")
    private List<WebElement> elementSize;

    public void moveToElement(){
    ReusableMethods.hover(electronics);
    }

    public void moveToElementApple(){
        ReusableMethods.hover(apple);
        apple.click();
    }
    public void cellPhoneClick(){
        linkCellphonesSmartphones.click();
    }
    public void slideClick(){
        ReusableMethods.hover(rightSlide);
        rightSlide.click();
    }
    public void proMaxClick(){
        iphoneproMax.click();
    }
    public void tbClick(){
        tbButton.click();
    }
    public void purpleIphoneClick(){
        purpleColor.click();
    }
    public void resultVerifyProducts(){
        int resultNumber = Integer.parseInt(results.getText().replaceAll(" Results",""));
        Assert.assertNotEquals(resultNumber,elementSize.size());
    }







}
