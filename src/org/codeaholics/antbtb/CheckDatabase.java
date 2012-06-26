package org.codeaholics.antbtb;

import org.apache.tools.ant.Project;

public class CheckDatabase {
    private Project project;
    private String name;
    private String user;
    private String password;

    public void setProject(final Project project) {
        this.project = project;
    }


    public void setName(final String name) {
        this.name = name;
    }


    public void setUser(final String user) {
        this.user = user;
    }


    public void setPassword(final String password) {
        this.password = password;
    }


    public void execute() {
        project.log(String.format("Checking database %s as %s:%s", name, user, password), Project.MSG_INFO);
    }
}
