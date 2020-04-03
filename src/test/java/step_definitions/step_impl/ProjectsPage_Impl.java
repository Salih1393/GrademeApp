package step_definitions.step_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.ProjectsPage;
import utils.Driver;
import utils.SeleniumUtils;

public class ProjectsPage_Impl {

    ProjectsPage projects = new ProjectsPage();

    public void openProject(String projectName){
        switch (projectName){
            case "Hello World":
                SeleniumUtils.click(projects.project_HelloWorld);
                break;
        }
    }

    public void openWeek(int week){
        switch (week){
            case 1:
                SeleniumUtils.click(projects.week_1);
                break;
        }
    }

    public void inputCode(String code){

        SeleniumUtils.click(projects.passText);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='Avinash Mishra';", projects.passText);
        SeleniumUtils.sleep(2000);
//        SeleniumUtils.clear(projects.passText);
//        SeleniumUtils.sleep(2000);
        SeleniumUtils.sendKeys(projects.passText,code);
        SeleniumUtils.click(projects.evaluate_Btn);
        SeleniumUtils.sleep(5000);
    }
}
