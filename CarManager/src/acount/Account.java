package acount;

import java.io.Serializable;

public class Account implements Serializable{
    private String name,pass;
    private int type, status;

    public Account() {
    }

    public Account(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public Account(String name, String pass, int type, int status) {
        this.name = name;
        this.pass = pass;
        this.type = type;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", pass=" + pass + ", type=" + type + ", status=" + status + '}';
    }

}
