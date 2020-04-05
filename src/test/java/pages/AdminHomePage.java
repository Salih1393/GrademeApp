package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AdminHomePage {

    public AdminHomePage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password_logIn")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
    public WebElement logIn_Btn;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logOut_Btn;

    @FindBy(xpath = "//div[contains(text(),'Log In to your account')]")
    public WebElement logIn_Text;

    @FindBy(xpath = "//a[contains(text(),'Projects')]")
    public WebElement project_Btn;

    @FindBy(xpath = "//a[contains(text(),'GRADEME')]")
    public WebElement techLead_Btn;

}
