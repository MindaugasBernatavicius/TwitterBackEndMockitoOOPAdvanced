package com.twitter.core.model.user;

public class User {
    private String name;
    private String handle;
    private int age;
    private Sex sex;

    public User(String name,
                String handle,
                int age, Sex sex) {
        this.name = name;
        this.handle = "@" + handle;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name != null && !"".equals(name))
            this.name = name;
        else
            throw new Exception("Name must not be empty!");
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        if (handle.charAt(0) != '@')
            this.handle = "@" + handle;
        else
            this.handle = handle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}