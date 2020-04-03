package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProjectsPage;
import step_definitions.step_impl.ProjectsPage_Impl;
import utils.SeleniumUtils;

public class ProjectsPage_STEPS {

    ProjectsPage projects = new ProjectsPage();
    ProjectsPage_Impl projectsPage_Impl = new ProjectsPage_Impl();

    @When("User selects week {string}")
    public void user_selects_week(String string) {
        SeleniumUtils.waitForClickability(projects.week_1);
        projectsPage_Impl.openWeek(Integer.parseInt(string));
    }

    @And("User opens {string} project")
    public void user_opens_project(String string) {
        SeleniumUtils.waitForVisibilityOfElement(projects.project_HelloWorld);
        projectsPage_Impl.openProject(string);
    }

    @When("User inputs {string}")
    public void user_inputs(String string) {
        projectsPage_Impl.inputCode(string);
    }
}
