package step_definitions.step_impl;

import org.testng.Assert;
import pages.AdminHomePage;
import pages.ProjectsPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminHomePage_Impl {

    AdminHomePage admin = new AdminHomePage();
    ProjectsPage project = new ProjectsPage();

    public void logIn(){

        SeleniumUtils.sendKeys(admin.email, ConfigReader.readProperty("adminUserName"));
        SeleniumUtils.sendKeys(admin.password, ConfigReader.readProperty("adminPassword"));
        SeleniumUtils.click(admin.logIn_Btn);

    }

    public void logOut(){
        SeleniumUtils.click(admin.logOut_Btn);
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "login":
                Driver.getDriver().get(ConfigReader.readProperty("adminUrl"));
                break;
            case "projects":
                SeleniumUtils.click(admin.project_Btn);
                break;
            case "tech lead":
                SeleniumUtils.click(admin.techLead_Btn);
                break;
        }
    }

    public boolean verifyText(String text){
        switch (text){
            case "Log In to your account":
                if(text.equalsIgnoreCase(admin.logIn_Text.getText()))
                    return true;
                break;
            case "Requirement:":
                if(text.equalsIgnoreCase(project.requirementText.getText()))
                    return true;
                break;
            case "PASS:":
                if(text.equalsIgnoreCase(project.passText.getText()))
                    return true;
                break;
        }
        return false;
    }
}
