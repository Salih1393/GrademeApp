package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ProjectsPage {

    public ProjectsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h4[@id='requirement']")
    public WebElement requirementText;

    @FindBy(css = "div.container ul.list-group li.list-group-item:nth-child(1) div.mt-2.mb-2 div.mt-2.collapse.show:nth-child(3) > a.stretched-link:nth-child(1)")
    public WebElement project_HelloWorld;

    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[3]//button[1]//span[1]")
    public WebElement week_1;

    @FindBy(xpath = "//span[@class='cm-comment']")
    public WebElement passText;

    @FindBy(xpath = "//button[@class='btn btn-primary ml-1']")
    public WebElement evaluate_Btn;


}
