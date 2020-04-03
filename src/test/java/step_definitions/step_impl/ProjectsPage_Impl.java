package step_definitions.step_impl;

import pages.ProjectsPage;
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
}
