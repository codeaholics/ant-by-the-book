package org.codeaholics.antbtb;

import org.apache.tools.ant.Project;

public class CheckDatabases {
    private Project project;

    public void setProject(final Project project) {
        this.project = project;
    }

    public void execute() {
        project.log("I can haz all ur databasez!", Project.MSG_INFO);
    }
}
