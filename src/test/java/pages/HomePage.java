package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//span[@data-id='Personal Loans']")
    public WebElement Loans;

    @FindBy(linkText = "In-School Student Loans")
    public WebElement InSchoolStudentLoans;

    @FindBy(xpath="//span[@data-id='Auto']")
    public WebElement Auto;

    @FindBy(xpath = "//a[@data-clickid='PF-BTN-CLK-AUTO-LOANS_REVIEW']")
    public WebElement AutoLoanApplication;

    @FindBy(id = "toggle-search")
    public WebElement SearchBox;

    @FindBy(id = "menu-search-input")
    public WebElement SearchInput;

    @FindBy(xpath = "//span[@data-id='Cards']")
    public WebElement CreditCards;

}
