package org.codeaholics.antbtb;

import java.util.LinkedList;
import java.util.List;

import org.apache.tools.ant.Project;

public class CheckDatabases {
    private Project project;

    public void setProject(final Project project) {
        this.project = project;
    }

    public void execute() {
        for (final Database database : getAllDatabases()) {
            database.isAlive(project);
        }
    }

    private List<Database> getAllDatabases() {
        final List<Database> allDatabases = new LinkedList<Database>();

        for (final Object object: project.getReferences().values()) {
            if (object instanceof Database) {
                allDatabases.add((Database)object);
            }
        }

        return allDatabases;
    }
}
