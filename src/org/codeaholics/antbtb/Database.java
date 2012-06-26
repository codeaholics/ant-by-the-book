package org.codeaholics.antbtb;

import org.apache.tools.ant.types.DataType;

public class Database extends DataType {
    private String id;
    private String user;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
