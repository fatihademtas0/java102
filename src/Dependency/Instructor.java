package Dependency;

public class Instructor {
    private String name;
    private String surName;
    private String department;

    Instructor(String name, String surName, String department) {
        this.name = name;
        this.surName = surName;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
