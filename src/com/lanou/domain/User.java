package com.lanou.domain;

/**
 * Created by dllo on 17/10/24.
 */
public class User {
    private int id;//主键id
    private String loginName;//用户名
    private String password;//密码

    public User() {
    }

    public User(String name, String password) {
        this.loginName = name;
        this.password = password;
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.loginName = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String name) {
        this.loginName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
