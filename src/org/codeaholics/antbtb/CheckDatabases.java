package org.codeaholics.antbtb;

import java.util.LinkedList;
import java.util.List;

import org.apache.tools.ant.Project;

public class CheckDatabases {
    private Project project;
    private final List<Database> databases = new LinkedList<Database>();

    public void setProject(final Project project) {
        this.project = project;
    }

    public void addConfigured(final Database db) {
        if (db.isReference()) {
            databases.add((Database)db.getRefid().getReferencedObject());
        } else {
            databases.add(db);
        }
    }

    public void execute() {
        for (final Database database : databases) {
            project.log(String.format("Checking database %s as %s:%s", database.getId(), database.getUser(), database.getPassword()), Project.MSG_INFO);
        }
    }
}
